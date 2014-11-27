package com.sweetspot.api.models;

public class Goal {
  private String prettyGoalProgress;
  private String scorecardItemId;
  private String type;
  private String completedDate;
  private String startDate;
  private String value;
  private boolean goalEnabled;
  private String endDate;
  private boolean goalFailed;
  private float completionPercentaje;
  private String goalShortDescription;
  private boolean recurringGoal;
  private boolean goalStarted;
  private boolean goalCompleted;
  private String goalType;
  
  public Goal() {
    
  }

  public Goal(String prettyGoalProgress, String scorecardItemId, String type,
      String completedDate, String startDate, String value,
      boolean goalEnabled, String endDate, boolean goalFailed,
      float completionPercentaje, String goalShortDescription,
      boolean recurringGoal, boolean goalStarted, boolean goalCompleted,
      String goalType) {
    super();
    this.prettyGoalProgress = prettyGoalProgress;
    this.scorecardItemId = scorecardItemId;
    this.type = type;
    this.completedDate = completedDate;
    this.startDate = startDate;
    this.value = value;
    this.goalEnabled = goalEnabled;
    this.endDate = endDate;
    this.goalFailed = goalFailed;
    this.completionPercentaje = completionPercentaje;
    this.goalShortDescription = goalShortDescription;
    this.recurringGoal = recurringGoal;
    this.goalStarted = goalStarted;
    this.goalCompleted = goalCompleted;
    this.goalType = goalType;
  }

  public String getPrettyGoalProgress() {
    return prettyGoalProgress;
  }

  public void setPrettyGoalProgress(String prettyGoalProgress) {
    this.prettyGoalProgress = prettyGoalProgress;
  }

  public String getScorecardItemId() {
    return scorecardItemId;
  }

  public void setScorecardItemId(String scorecardItemId) {
    this.scorecardItemId = scorecardItemId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(String completedDate) {
    this.completedDate = completedDate;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public boolean isGoalEnabled() {
    return goalEnabled;
  }

  public void setGoalEnabled(boolean goalEnabled) {
    this.goalEnabled = goalEnabled;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public boolean isGoalFailed() {
    return goalFailed;
  }

  public void setGoalFailed(boolean goalFailed) {
    this.goalFailed = goalFailed;
  }

  public float getCompletionPercentaje() {
    return completionPercentaje;
  }

  public void setCompletionPercentaje(float completionPercentaje) {
    this.completionPercentaje = completionPercentaje;
  }

  public String getGoalShortDescription() {
    return goalShortDescription;
  }

  public void setGoalShortDescription(String goalShortDescription) {
    this.goalShortDescription = goalShortDescription;
  }

  public boolean isRecurringGoal() {
    return recurringGoal;
  }

  public void setRecurringGoal(boolean recurringGoal) {
    this.recurringGoal = recurringGoal;
  }

  public boolean isGoalStarted() {
    return goalStarted;
  }

  public void setGoalStarted(boolean goalStarted) {
    this.goalStarted = goalStarted;
  }

  public boolean isGoalCompleted() {
    return goalCompleted;
  }

  public void setGoalCompleted(boolean goalCompleted) {
    this.goalCompleted = goalCompleted;
  }

  public String getGoalType() {
    return goalType;
  }

  public void setGoalType(String goalType) {
    this.goalType = goalType;
  }

  @Override
  public String toString() {
    return "Goal [prettyGoalProgress=" + prettyGoalProgress
        + ", scorecardItemId=" + scorecardItemId + ", type=" + type
        + ", completedDate=" + completedDate + ", startDate=" + startDate
        + ", value=" + value + ", goalEnabled=" + goalEnabled + ", endDate="
        + endDate + ", goalFailed=" + goalFailed + ", completionPercentaje="
        + completionPercentaje + ", goalShortDescription="
        + goalShortDescription + ", recurringGoal=" + recurringGoal
        + ", goalStarted=" + goalStarted + ", goalCompleted=" + goalCompleted
        + ", goalType=" + goalType + "]";
  }
}
