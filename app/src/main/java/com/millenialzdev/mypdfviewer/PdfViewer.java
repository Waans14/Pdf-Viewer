package com.millenialzdev.mypdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.joanzapata.pdfview.PDFView;

public class PdfViewer extends AppCompatActivity {

    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);
        pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("pdf_file.pdf")
                .swipeVertical(true)
                .load();
    }
}