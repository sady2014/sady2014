package com.thsware.entity;


import java.sql.Timestamp;

public class BugEntity {
    private long bgCycleId;
    private long bgBugId;
    private String bgStatus;
    private String bgResponsible;
    private String bgProject;
    private long bgSubject;
    private String bgSummary;
    private String bgDescription;
    private String bgDevComments;
    private String bgReproducible;
    private String bgSeverity;
    private String bgPriority;
    private String bgDetectedBy;
    private long bgTestReference;
    private String bgCycleReference;
    private long bgRunReference;
    private long bgStepReference;
    private java.sql.Timestamp bgDetectionDate;
    private String bgDetectionVersion;
    private String bgPlannedClosingVer;
    private long bgEstimatedFixTime;
    private long bgActualFixTime;
    private java.sql.Timestamp bgClosingDate;
    private String bgClosingVersion;
    private String bgToMail;
    private String bgAttachment;
    private String bgUser01;
    private String bgUser02;
    private String bgUser03;
    private String bgUser04;
    private String bgUser05;
    private String bgUser06;
    private String bgUser07;
    private String bgUser08;
    private String bgUser09;
    private String bgUser10;
    private String bgUser11;
    private String bgUser12;
    private String bgUser13;
    private String bgUser14;
    private String bgUser15;
    private String bgUser16;
    private String bgUser17;
    private String bgUser18;
    private String bgUser19;
    private String bgUser20;
    private String bgUser21;
    private String bgUser22;
    private String bgUser23;
    private String bgUser24;
    private long bgUserHr01;
    private long bgUserHr02;
    private long bgUserHr03;
    private long bgUserHr04;
    private long bgUserHr05;
    private long bgUserHr06;
    private long bgBugVerStamp;
    private String bgHasChange;
    private String bgVts;
    private String bgExtendedReference;
    private String bgTaskStatus;

    public BugEntity() {
        super();
    }

    @Override
    public String toString() {
        return "BugEntity{" +
                "bgCycleId=" + bgCycleId +
                ", bgBugId=" + bgBugId +
                ", bgStatus='" + bgStatus + '\'' +
                ", bgResponsible='" + bgResponsible + '\'' +
                ", bgProject='" + bgProject + '\'' +
                ", bgSubject=" + bgSubject +
                ", bgSummary='" + bgSummary + '\'' +
                ", bgDescription='" + bgDescription + '\'' +
                ", bgDevComments='" + bgDevComments + '\'' +
                ", bgReproducible='" + bgReproducible + '\'' +
                ", bgSeverity='" + bgSeverity + '\'' +
                ", bgPriority='" + bgPriority + '\'' +
                ", bgDetectedBy='" + bgDetectedBy + '\'' +
                ", bgTestReference=" + bgTestReference +
                ", bgCycleReference='" + bgCycleReference + '\'' +
                ", bgRunReference=" + bgRunReference +
                ", bgStepReference=" + bgStepReference +
                ", bgDetectionDate=" + bgDetectionDate +
                ", bgDetectionVersion='" + bgDetectionVersion + '\'' +
                ", bgPlannedClosingVer='" + bgPlannedClosingVer + '\'' +
                ", bgEstimatedFixTime=" + bgEstimatedFixTime +
                ", bgActualFixTime=" + bgActualFixTime +
                ", bgClosingDate=" + bgClosingDate +
                ", bgClosingVersion='" + bgClosingVersion + '\'' +
                ", bgToMail='" + bgToMail + '\'' +
                ", bgAttachment='" + bgAttachment + '\'' +
                ", bgUser01='" + bgUser01 + '\'' +
                ", bgUser02='" + bgUser02 + '\'' +
                ", bgUser03='" + bgUser03 + '\'' +
                ", bgUser04='" + bgUser04 + '\'' +
                ", bgUser05='" + bgUser05 + '\'' +
                ", bgUser06='" + bgUser06 + '\'' +
                ", bgUser07='" + bgUser07 + '\'' +
                ", bgUser08='" + bgUser08 + '\'' +
                ", bgUser09='" + bgUser09 + '\'' +
                ", bgUser10='" + bgUser10 + '\'' +
                ", bgUser11='" + bgUser11 + '\'' +
                ", bgUser12='" + bgUser12 + '\'' +
                ", bgUser13='" + bgUser13 + '\'' +
                ", bgUser14='" + bgUser14 + '\'' +
                ", bgUser15='" + bgUser15 + '\'' +
                ", bgUser16='" + bgUser16 + '\'' +
                ", bgUser17='" + bgUser17 + '\'' +
                ", bgUser18='" + bgUser18 + '\'' +
                ", bgUser19='" + bgUser19 + '\'' +
                ", bgUser20='" + bgUser20 + '\'' +
                ", bgUser21='" + bgUser21 + '\'' +
                ", bgUser22='" + bgUser22 + '\'' +
                ", bgUser23='" + bgUser23 + '\'' +
                ", bgUser24='" + bgUser24 + '\'' +
                ", bgUserHr01=" + bgUserHr01 +
                ", bgUserHr02=" + bgUserHr02 +
                ", bgUserHr03=" + bgUserHr03 +
                ", bgUserHr04=" + bgUserHr04 +
                ", bgUserHr05=" + bgUserHr05 +
                ", bgUserHr06=" + bgUserHr06 +
                ", bgBugVerStamp=" + bgBugVerStamp +
                ", bgHasChange='" + bgHasChange + '\'' +
                ", bgVts='" + bgVts + '\'' +
                ", bgExtendedReference='" + bgExtendedReference + '\'' +
                ", bgTaskStatus='" + bgTaskStatus + '\'' +
                '}';
    }

    public long getBgCycleId() {
        return bgCycleId;
    }

    public void setBgCycleId(long bgCycleId) {
        this.bgCycleId = bgCycleId;
    }

    public long getBgBugId() {
        return bgBugId;
    }

    public void setBgBugId(long bgBugId) {
        this.bgBugId = bgBugId;
    }

    public String getBgStatus() {
        return bgStatus;
    }

    public void setBgStatus(String bgStatus) {
        this.bgStatus = bgStatus;
    }

    public String getBgResponsible() {
        return bgResponsible;
    }

    public void setBgResponsible(String bgResponsible) {
        this.bgResponsible = bgResponsible;
    }

    public String getBgProject() {
        return bgProject;
    }

    public void setBgProject(String bgProject) {
        this.bgProject = bgProject;
    }

    public long getBgSubject() {
        return bgSubject;
    }

    public void setBgSubject(long bgSubject) {
        this.bgSubject = bgSubject;
    }

    public String getBgSummary() {
        return bgSummary;
    }

    public void setBgSummary(String bgSummary) {
        this.bgSummary = bgSummary;
    }

    public String getBgDescription() {
        return bgDescription;
    }

    public void setBgDescription(String bgDescription) {
        this.bgDescription = bgDescription;
    }

    public String getBgDevComments() {
        return bgDevComments;
    }

    public void setBgDevComments(String bgDevComments) {
        this.bgDevComments = bgDevComments;
    }

    public String getBgReproducible() {
        return bgReproducible;
    }

    public void setBgReproducible(String bgReproducible) {
        this.bgReproducible = bgReproducible;
    }

    public String getBgSeverity() {
        return bgSeverity;
    }

    public void setBgSeverity(String bgSeverity) {
        this.bgSeverity = bgSeverity;
    }

    public String getBgPriority() {
        return bgPriority;
    }

    public void setBgPriority(String bgPriority) {
        this.bgPriority = bgPriority;
    }

    public String getBgDetectedBy() {
        return bgDetectedBy;
    }

    public void setBgDetectedBy(String bgDetectedBy) {
        this.bgDetectedBy = bgDetectedBy;
    }

    public long getBgTestReference() {
        return bgTestReference;
    }

    public void setBgTestReference(long bgTestReference) {
        this.bgTestReference = bgTestReference;
    }

    public String getBgCycleReference() {
        return bgCycleReference;
    }

    public void setBgCycleReference(String bgCycleReference) {
        this.bgCycleReference = bgCycleReference;
    }

    public long getBgRunReference() {
        return bgRunReference;
    }

    public void setBgRunReference(long bgRunReference) {
        this.bgRunReference = bgRunReference;
    }

    public long getBgStepReference() {
        return bgStepReference;
    }

    public void setBgStepReference(long bgStepReference) {
        this.bgStepReference = bgStepReference;
    }

    public Timestamp getBgDetectionDate() {
        return bgDetectionDate;
    }

    public void setBgDetectionDate(Timestamp bgDetectionDate) {
        this.bgDetectionDate = bgDetectionDate;
    }

    public String getBgDetectionVersion() {
        return bgDetectionVersion;
    }

    public void setBgDetectionVersion(String bgDetectionVersion) {
        this.bgDetectionVersion = bgDetectionVersion;
    }

    public String getBgPlannedClosingVer() {
        return bgPlannedClosingVer;
    }

    public void setBgPlannedClosingVer(String bgPlannedClosingVer) {
        this.bgPlannedClosingVer = bgPlannedClosingVer;
    }

    public long getBgEstimatedFixTime() {
        return bgEstimatedFixTime;
    }

    public void setBgEstimatedFixTime(long bgEstimatedFixTime) {
        this.bgEstimatedFixTime = bgEstimatedFixTime;
    }

    public long getBgActualFixTime() {
        return bgActualFixTime;
    }

    public void setBgActualFixTime(long bgActualFixTime) {
        this.bgActualFixTime = bgActualFixTime;
    }

    public Timestamp getBgClosingDate() {
        return bgClosingDate;
    }

    public void setBgClosingDate(Timestamp bgClosingDate) {
        this.bgClosingDate = bgClosingDate;
    }

    public String getBgClosingVersion() {
        return bgClosingVersion;
    }

    public void setBgClosingVersion(String bgClosingVersion) {
        this.bgClosingVersion = bgClosingVersion;
    }

    public String getBgToMail() {
        return bgToMail;
    }

    public void setBgToMail(String bgToMail) {
        this.bgToMail = bgToMail;
    }

    public String getBgAttachment() {
        return bgAttachment;
    }

    public void setBgAttachment(String bgAttachment) {
        this.bgAttachment = bgAttachment;
    }

    public String getBgUser01() {
        return bgUser01;
    }

    public void setBgUser01(String bgUser01) {
        this.bgUser01 = bgUser01;
    }

    public String getBgUser02() {
        return bgUser02;
    }

    public void setBgUser02(String bgUser02) {
        this.bgUser02 = bgUser02;
    }

    public String getBgUser03() {
        return bgUser03;
    }

    public void setBgUser03(String bgUser03) {
        this.bgUser03 = bgUser03;
    }

    public String getBgUser04() {
        return bgUser04;
    }

    public void setBgUser04(String bgUser04) {
        this.bgUser04 = bgUser04;
    }

    public String getBgUser05() {
        return bgUser05;
    }

    public void setBgUser05(String bgUser05) {
        this.bgUser05 = bgUser05;
    }

    public String getBgUser06() {
        return bgUser06;
    }

    public void setBgUser06(String bgUser06) {
        this.bgUser06 = bgUser06;
    }

    public String getBgUser07() {
        return bgUser07;
    }

    public void setBgUser07(String bgUser07) {
        this.bgUser07 = bgUser07;
    }

    public String getBgUser08() {
        return bgUser08;
    }

    public void setBgUser08(String bgUser08) {
        this.bgUser08 = bgUser08;
    }

    public String getBgUser09() {
        return bgUser09;
    }

    public void setBgUser09(String bgUser09) {
        this.bgUser09 = bgUser09;
    }

    public String getBgUser10() {
        return bgUser10;
    }

    public void setBgUser10(String bgUser10) {
        this.bgUser10 = bgUser10;
    }

    public String getBgUser11() {
        return bgUser11;
    }

    public void setBgUser11(String bgUser11) {
        this.bgUser11 = bgUser11;
    }

    public String getBgUser12() {
        return bgUser12;
    }

    public void setBgUser12(String bgUser12) {
        this.bgUser12 = bgUser12;
    }

    public String getBgUser13() {
        return bgUser13;
    }

    public void setBgUser13(String bgUser13) {
        this.bgUser13 = bgUser13;
    }

    public String getBgUser14() {
        return bgUser14;
    }

    public void setBgUser14(String bgUser14) {
        this.bgUser14 = bgUser14;
    }

    public String getBgUser15() {
        return bgUser15;
    }

    public void setBgUser15(String bgUser15) {
        this.bgUser15 = bgUser15;
    }

    public String getBgUser16() {
        return bgUser16;
    }

    public void setBgUser16(String bgUser16) {
        this.bgUser16 = bgUser16;
    }

    public String getBgUser17() {
        return bgUser17;
    }

    public void setBgUser17(String bgUser17) {
        this.bgUser17 = bgUser17;
    }

    public String getBgUser18() {
        return bgUser18;
    }

    public void setBgUser18(String bgUser18) {
        this.bgUser18 = bgUser18;
    }

    public String getBgUser19() {
        return bgUser19;
    }

    public void setBgUser19(String bgUser19) {
        this.bgUser19 = bgUser19;
    }

    public String getBgUser20() {
        return bgUser20;
    }

    public void setBgUser20(String bgUser20) {
        this.bgUser20 = bgUser20;
    }

    public String getBgUser21() {
        return bgUser21;
    }

    public void setBgUser21(String bgUser21) {
        this.bgUser21 = bgUser21;
    }

    public String getBgUser22() {
        return bgUser22;
    }

    public void setBgUser22(String bgUser22) {
        this.bgUser22 = bgUser22;
    }

    public String getBgUser23() {
        return bgUser23;
    }

    public void setBgUser23(String bgUser23) {
        this.bgUser23 = bgUser23;
    }

    public String getBgUser24() {
        return bgUser24;
    }

    public void setBgUser24(String bgUser24) {
        this.bgUser24 = bgUser24;
    }

    public long getBgUserHr01() {
        return bgUserHr01;
    }

    public void setBgUserHr01(long bgUserHr01) {
        this.bgUserHr01 = bgUserHr01;
    }

    public long getBgUserHr02() {
        return bgUserHr02;
    }

    public void setBgUserHr02(long bgUserHr02) {
        this.bgUserHr02 = bgUserHr02;
    }

    public long getBgUserHr03() {
        return bgUserHr03;
    }

    public void setBgUserHr03(long bgUserHr03) {
        this.bgUserHr03 = bgUserHr03;
    }

    public long getBgUserHr04() {
        return bgUserHr04;
    }

    public void setBgUserHr04(long bgUserHr04) {
        this.bgUserHr04 = bgUserHr04;
    }

    public long getBgUserHr05() {
        return bgUserHr05;
    }

    public void setBgUserHr05(long bgUserHr05) {
        this.bgUserHr05 = bgUserHr05;
    }

    public long getBgUserHr06() {
        return bgUserHr06;
    }

    public void setBgUserHr06(long bgUserHr06) {
        this.bgUserHr06 = bgUserHr06;
    }

    public long getBgBugVerStamp() {
        return bgBugVerStamp;
    }

    public void setBgBugVerStamp(long bgBugVerStamp) {
        this.bgBugVerStamp = bgBugVerStamp;
    }

    public String getBgHasChange() {
        return bgHasChange;
    }

    public void setBgHasChange(String bgHasChange) {
        this.bgHasChange = bgHasChange;
    }

    public String getBgVts() {
        return bgVts;
    }

    public void setBgVts(String bgVts) {
        this.bgVts = bgVts;
    }

    public String getBgExtendedReference() {
        return bgExtendedReference;
    }

    public void setBgExtendedReference(String bgExtendedReference) {
        this.bgExtendedReference = bgExtendedReference;
    }

    public String getBgTaskStatus() {
        return bgTaskStatus;
    }

    public void setBgTaskStatus(String bgTaskStatus) {
        this.bgTaskStatus = bgTaskStatus;
    }
}