package com.londonappbrewery.destini;

/**
 * Created by MRSFU on 7/31/2017.
 */

public class Story {

    private int mStoryText;
    private int mTopAnswer;
    private int mBottomAnswer;

    Story(int mStoryText, int mTopAnswer, int mBottomAnswer){
        this.mStoryText = mStoryText;
        this.mTopAnswer = mTopAnswer;
        this.mBottomAnswer = mBottomAnswer;

    }

    public int getStoryText() {
        return mStoryText;
    }

    public void setStoryText(int storyText) {
        mStoryText = storyText;
    }

    public int getTopAnswer() {
        return mTopAnswer;
    }

    public void setTopAnswer(int topAnswer) {
        mTopAnswer = topAnswer;
    }

    public int getBottomAnswer() {
        return mBottomAnswer;
    }

    public void setBottomAnswer(int bottomAnswer) {
        mBottomAnswer = bottomAnswer;
    }
}
