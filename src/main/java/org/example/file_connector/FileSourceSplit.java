package org.example.file_connector;

import org.apache.flink.api.connector.source.SourceSplit;

public class FileSourceSplit implements SourceSplit {
    @Override
    public String splitId() {
        return "";
    }
}
