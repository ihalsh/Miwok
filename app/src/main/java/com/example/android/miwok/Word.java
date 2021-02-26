package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int nImage = -1;
    private int audioFile;

    public Word(String mDefaultTranslation, String mMiwokTranslation, int nImage, int audioFile) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.nImage = nImage;
        this.audioFile = audioFile;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int audioFile) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.audioFile = audioFile;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getnImage() {
        return nImage;
    }
    public int getAudioFile() {
        return audioFile;
    }

    public boolean hasImage() {
        return nImage != -1;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", nImage=" + nImage +
                ", audioFile=" + audioFile +
                '}';
    }
}
