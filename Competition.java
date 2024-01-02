package cw;
import java.io.*;
import java.util.ArrayList;

public class Competition {
	private int CompetitionNumber ;
	private int CompetitionScore;
	private int CompetitionPlacement;
	private int CompetitionLevel;
	private ArrayList<Competitor> Competitors;	
	

public Competition(int CompN,int CompS,int CompP,int CompL, ArrayList <Competitor>CompetitorsS,String place)
{
	CompetitionNumber = CompN;
	CompetitionScore = CompS;
	CompetitionPlacement = CompP;
	CompetitionLevel = CompL;
	Competitors = CompetitorsS;

}
public int getCompetitionNumber() {
	return CompetitionNumber;
	}
public String getShortCompetitiorDetailsReport() {
	return ShortCompetitorDetailsReport;
}
public String getLongCompetititorReport() {
	return LongCompetititorDetailsReport;
	
}
public ArrayList<Competitor> getAllCompetitors() {
	return Competitors;
}
public int getCompetitionScore() {
	return CompetitionScore;
}
public int getCompetitionPlacement() {
	return CompetitionPlacement;
}
public int getCompetitionLevel() {
	return CompetitionLevel;
}


}

