package org.example.file_connector;

import org.apache.flink.api.connector.source.*;
import org.apache.flink.core.io.SimpleVersionedSerializer;

public class FileSource<T> implements Source<T, FileSourceSplit, FileCheckpoint> {
    @Override
    public Boundedness getBoundedness() {
        return null;
    }

    @Override
    public SplitEnumerator<FileSourceSplit, FileCheckpoint> createEnumerator(SplitEnumeratorContext<FileSourceSplit> splitEnumeratorContext) throws Exception {
        return null;
    }

    @Override
    public SplitEnumerator<FileSourceSplit, FileCheckpoint> restoreEnumerator(SplitEnumeratorContext<FileSourceSplit> splitEnumeratorContext, FileCheckpoint fileCheckpoint) throws Exception {
        return null;
    }

    @Override
    public SimpleVersionedSerializer<FileSourceSplit> getSplitSerializer() {
        return null;
    }

    @Override
    public SimpleVersionedSerializer<FileCheckpoint> getEnumeratorCheckpointSerializer() {
        return null;
    }

    @Override
    public SourceReader<T, FileSourceSplit> createReader(SourceReaderContext sourceReaderContext) throws Exception {
        return null;
    }
}
