package com.schedulingapp.interactor;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class SpreadsheetInteractor {
    //
    // Fields
    //

    private static final String applicationName = "Google Sheets API Java Quickstart";
    private static final JsonFactory jsonFactory = GsonFactory.getDefaultInstance();

    private final String spreadsheetId;
    private final GoogleAccountCredential credential;

    //
    // Constructors
    //

    public SpreadsheetInteractor(
            String spreadsheetId, GoogleAccountCredential credential) {
        this.spreadsheetId = spreadsheetId;
        this.credential = credential;
    }

    public ValueRange getValues()
            throws GeneralSecurityException, IOException {

        final NetHttpTransport httpTransport =
                GoogleNetHttpTransport.newTrustedTransport();
        final String range = "Sheet1";
        Sheets service = new Sheets.Builder(httpTransport, jsonFactory, credential)
                .setApplicationName(applicationName).build();

        return service.spreadsheets().values().get(spreadsheetId, range).execute();
    }



}
