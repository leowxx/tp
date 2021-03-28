package seedu.duke;

import seedu.duke.model.Patient;
import seedu.duke.model.Record;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * This class handles the loading and saving of data from/to a plaintext file on
 * the hard drive.
 */
public class Storage {
    protected String filePath;

    /**
     * This is the constructor of the Storage class.
     * @param filePath Path of the file that would be used for data storage
     */
    public Storage(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Saves the sorted map into a file as specified by filePath.
     * @param patientData The sorted map of patients to be saved into the file
     * @throws IOException When file is not found etc
     */
    public void save(SortedMap<String, Patient> patientData) throws IOException {
        try {
            File inFile = new File(filePath);
            inFile.createNewFile();
            FileWriter fileWriter = new FileWriter(inFile.getAbsolutePath(), false);
            StringBuffer message = new StringBuffer();
            Set patientSet = patientData.entrySet();
            Iterator patientIterator = patientSet.iterator();

            while (patientIterator.hasNext()) {
                Map.Entry m = (Map.Entry)patientIterator.next();

                String id = (String)m.getKey();
                Patient patient = (Patient)m.getValue();
                String records = convertRecordToString(patient);

                message.append(id + Constants.IC_SEPARATOR + records + System.lineSeparator());
            }
            System.out.println(message);
            fileWriter.write(message.toString());
            fileWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Converts patient records into string.
     * @param patient Patient record to be converted
     * @return Resulting string that represents the record
     */
    public String convertRecordToString(Patient patient) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Record record : patient.getRecords()) {
            stringBuilder.append(record.getConsultationDetail());
            stringBuilder.append(Constants.DATE_SEPARATOR);
        }

        return (stringBuilder.toString());
    }

    /**
     * Converts string to patient records.
     * @param recordString String to be converted
     * @return Resulting records that were represented by the string
     */
    public ArrayList<Record> convertStringToRecord(String recordString) {
        String[] splitString = recordString.split(Constants.DATE_SEPARATOR);
        ArrayList<Record> records = new ArrayList<Record>();
        for (String str : splitString) {
            records.add(new Record(str));
        }
        return records;
    }

    /**
     * Loads a sorted map from the file located at the specified filePath.
     * @return SortedMap of patients
     * @throws IOException When file is not found etc
     */
    //TODO: Fix load function
    public SortedMap<String, Patient> load() throws IOException {
        SortedMap<String, Patient> data = new TreeMap<>();
        try {
            File inFile = new File(filePath);
            Scanner scanner = new Scanner(inFile);
            while (scanner.hasNextLine()) {
                String[] retrievedPatientsData = scanner.nextLine().split(Constants.IC_SEPARATOR);
                String id = retrievedPatientsData[0];
                ArrayList<Record> records = convertStringToRecord(retrievedPatientsData[1]);
                Patient patient = new Patient(id, records);
                data.put(id, patient);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }
}
