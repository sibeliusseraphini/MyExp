package br.usp.myexp.ems.json;

import java.util.List;

public class QuestionnaireAnswers {
    
    private String questionnaireId;
    
    private List<AnswersGroup> answersGroupList;

    public QuestionnaireAnswers() {
    }

    public QuestionnaireAnswers(String questionnaireId, List<AnswersGroup> answersGroupList) {
        this.questionnaireId = questionnaireId;
        this.answersGroupList = answersGroupList;
    }

    public String getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(String questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public List<AnswersGroup> getAnswersGroupList() {
        return answersGroupList;
    }

    public void setAnswersGroups(List<AnswersGroup> answersGroupList) {
        this.answersGroupList = answersGroupList;
    }

}
