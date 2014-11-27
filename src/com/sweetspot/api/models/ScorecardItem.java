package com.sweetspot.api.models;

import java.util.Collection;

public class ScorecardItem {
  private float variationsObjectJson;
  private String logoUrl;
  private String scorecardFolderId;
  private String startDate;
  private String panelBlockFamilyId;
  private String scorecardTabLinkId;
  private boolean isLastVersion;
  private String sparklineTimeseries;
  private String prettyVariationWithSign;
  private int[] variationLimits;
  private String variationsObjectVariation;
  private String arrow;
  private Collection<AnalystOpinion> analystOpinions;
  private String endDate;
  private Object[][] variations; // multi-type array
  private String variationUnits;
  private String kpi;
  private String sparklineMainTitle;
  private String variationsObjectLabel;
  private String units;
  private String details;
  private String sparkLineTimeseriesDateFormat;
  private String ytd;
  private boolean hasLogo;
  private String panelDuration;
  private boolean hasTrend;
  private int position;
  private String scorecardPanelId;
  private String name;
  private Object[] variationsObject; // multi-type array
  private String scorecardTabLinkBreadcrumbName;
  private String id;
  private String path;
  private Goal goal;
  private float[] trend;
  
  public ScorecardItem() {
    
  }

  public ScorecardItem(float variationsObjectJson, String logoUrl,
      String scorecardFolderId, String startDate, String panelBlockFamilyId,
      String scorecardTabLinkId, boolean isLastVersion,
      String sparklineTimeseries, String prettyVariationWithSign,
      int[] variationLimits, String variationsObjectVariation, String arrow,
      Collection<AnalystOpinion> analystOpinions, String endDate,
      Object[][] variations, String variationUnits, String kpi,
      String sparklineMainTitle, String variationsObjectLabel, String units,
      String details, String sparkLineTimeseriesDateFormat, String ytd,
      boolean hasLogo, String panelDuration, boolean hasTrend, int position,
      String scorecardPanelId, String name, Object[] variationsObject,
      String scorecardTabLinkBreadcrumbName, String id, String path, Goal goal,
      float[] trend) {
    super();
    this.variationsObjectJson = variationsObjectJson;
    this.logoUrl = logoUrl;
    this.scorecardFolderId = scorecardFolderId;
    this.startDate = startDate;
    this.panelBlockFamilyId = panelBlockFamilyId;
    this.scorecardTabLinkId = scorecardTabLinkId;
    this.isLastVersion = isLastVersion;
    this.sparklineTimeseries = sparklineTimeseries;
    this.prettyVariationWithSign = prettyVariationWithSign;
    this.variationLimits = variationLimits;
    this.variationsObjectVariation = variationsObjectVariation;
    this.arrow = arrow;
    this.analystOpinions = analystOpinions;
    this.endDate = endDate;
    this.variations = variations;
    this.variationUnits = variationUnits;
    this.kpi = kpi;
    this.sparklineMainTitle = sparklineMainTitle;
    this.variationsObjectLabel = variationsObjectLabel;
    this.units = units;
    this.details = details;
    this.sparkLineTimeseriesDateFormat = sparkLineTimeseriesDateFormat;
    this.ytd = ytd;
    this.hasLogo = hasLogo;
    this.panelDuration = panelDuration;
    this.hasTrend = hasTrend;
    this.position = position;
    this.scorecardPanelId = scorecardPanelId;
    this.name = name;
    this.variationsObject = variationsObject;
    this.scorecardTabLinkBreadcrumbName = scorecardTabLinkBreadcrumbName;
    this.id = id;
    this.path = path;
    this.goal = goal;
    this.trend = trend;
  }

  public float getVariationsObjectJson() {
    return variationsObjectJson;
  }

  public void setVariationsObjectJson(float variationsObjectJson) {
    this.variationsObjectJson = variationsObjectJson;
  }

  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public String getScorecardFolderId() {
    return scorecardFolderId;
  }

  public void setScorecardFolderId(String scorecardFolderId) {
    this.scorecardFolderId = scorecardFolderId;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getPanelBlockFamilyId() {
    return panelBlockFamilyId;
  }

  public void setPanelBlockFamilyId(String panelBlockFamilyId) {
    this.panelBlockFamilyId = panelBlockFamilyId;
  }

  public String getScorecardTabLinkId() {
    return scorecardTabLinkId;
  }

  public void setScorecardTabLinkId(String scorecardTabLinkId) {
    this.scorecardTabLinkId = scorecardTabLinkId;
  }

  public boolean isLastVersion() {
    return isLastVersion;
  }

  public void setLastVersion(boolean isLastVersion) {
    this.isLastVersion = isLastVersion;
  }

  public String getSparklineTimeseries() {
    return sparklineTimeseries;
  }

  public void setSparklineTimeseries(String sparklineTimeseries) {
    this.sparklineTimeseries = sparklineTimeseries;
  }

  public String getPrettyVariationWithSign() {
    return prettyVariationWithSign;
  }

  public void setPrettyVariationWithSign(String prettyVariationWithSign) {
    this.prettyVariationWithSign = prettyVariationWithSign;
  }

  public int[] getVariationLimits() {
    return variationLimits;
  }

  public void setVariationLimits(int[] variationLimits) {
    this.variationLimits = variationLimits;
  }

  public String getVariationsObjectVariation() {
    return variationsObjectVariation;
  }

  public void setVariationsObjectVariation(String variationsObjectVariation) {
    this.variationsObjectVariation = variationsObjectVariation;
  }

  public String getArrow() {
    return arrow;
  }

  public void setArrow(String arrow) {
    this.arrow = arrow;
  }

  public Collection<AnalystOpinion> getAnalystOpinions() {
    return analystOpinions;
  }

  public void setAnalystOpinions(Collection<AnalystOpinion> analystOpinions) {
    this.analystOpinions = analystOpinions;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public Object[][] getVariations() {
    return variations;
  }

  public void setVariations(Object[][] variations) {
    this.variations = variations;
  }

  public String getVariationUnits() {
    return variationUnits;
  }

  public void setVariationUnits(String variationUnits) {
    this.variationUnits = variationUnits;
  }

  public String getKpi() {
    return kpi;
  }

  public void setKpi(String kpi) {
    this.kpi = kpi;
  }

  public String getSparklineMainTitle() {
    return sparklineMainTitle;
  }

  public void setSparklineMainTitle(String sparklineMainTitle) {
    this.sparklineMainTitle = sparklineMainTitle;
  }

  public String getVariationsObjectLabel() {
    return variationsObjectLabel;
  }

  public void setVariationsObjectLabel(String variationsObjectLabel) {
    this.variationsObjectLabel = variationsObjectLabel;
  }

  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public String getSparkLineTimeseriesDateFormat() {
    return sparkLineTimeseriesDateFormat;
  }

  public void setSparkLineTimeseriesDateFormat(String sparkLineTimeseriesDateFormat) {
    this.sparkLineTimeseriesDateFormat = sparkLineTimeseriesDateFormat;
  }

  public String getYtd() {
    return ytd;
  }

  public void setYtd(String ytd) {
    this.ytd = ytd;
  }

  public boolean isHasLogo() {
    return hasLogo;
  }

  public void setHasLogo(boolean hasLogo) {
    this.hasLogo = hasLogo;
  }

  public String getPanelDuration() {
    return panelDuration;
  }

  public void setPanelDuration(String panelDuration) {
    this.panelDuration = panelDuration;
  }

  public boolean isHasTrend() {
    return hasTrend;
  }

  public void setHasTrend(boolean hasTrend) {
    this.hasTrend = hasTrend;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public String getScorecardPanelId() {
    return scorecardPanelId;
  }

  public void setScorecardPanelId(String scorecardPanelId) {
    this.scorecardPanelId = scorecardPanelId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Object[] getVariationsObject() {
    return variationsObject;
  }

  public void setVariationsObject(Object[] variationsObject) {
    this.variationsObject = variationsObject;
  }

  public String getScorecardTabLinkBreadcrumbName() {
    return scorecardTabLinkBreadcrumbName;
  }

  public void setScorecardTabLinkBreadcrumbName(String scorecardTabLinkBreadcrumbName) {
    this.scorecardTabLinkBreadcrumbName = scorecardTabLinkBreadcrumbName;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Goal getGoal() {
    return goal;
  }

  public void setGoal(Goal goal) {
    this.goal = goal;
  }

  public float[] getTrend() {
    return trend;
  }

  public void setTrend(float[] trend) {
    this.trend = trend;
  }

  @Override
  public String toString() {
    return "ScorecardItem [logoUrl=" + logoUrl + ", startDate=" + startDate
        + ", arrow=" + arrow + ", endDate=" + endDate + ", kpi=" + kpi
        + ", units=" + units + ", panelDuration=" + panelDuration
        + ", position=" + position + ", scorecardPanelId=" + scorecardPanelId
        + ", name=" + name + ", id=" + id + ", path=" + path + "]";
  }
}
