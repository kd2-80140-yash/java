package com.sunbeam;

import java.util.List;
import java.util.Scanner;

public class CandidateMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * try(CandidateDao dao = new CandidateDao()) {
		 * System.out.print("Enter candidate id to be deleted: "); int id =
		 * sc.nextInt(); int cnt = dao.deleteById(id);
		 * System.out.println("Candidates deleted: " + cnt); } // dao.close(); catch
		 * (Exception e) { e.printStackTrace(); }
		 * 
		 * 
		 * /* try(CandidateDao dao = new CandidateDao()) { List<Candidate> list =
		 * dao.findAll(); list.forEach(c -> System.out.println(c)); } // dao.close();
		 * catch (Exception e) { e.printStackTrace(); }
		 */

		/*
		 * try(CandidateDao dao = new CandidateDao()) {
		 * System.out.print("Enter party: "); String party = sc.next(); List<Candidate>
		 * list = dao.findByParty(party); list.forEach(c -> System.out.println(c)); } //
		 * dao.close(); catch (Exception e) { e.printStackTrace(); }
		 */

//		try (CandidateDao dao = new CandidateDao()) {
//			System.out.print("Enter candidate id (to vote): ");
//			int candidateId = sc.nextInt();
//			int cnt = dao.incrementVote(candidateId);
//			System.out.println("Rows updated: " + cnt);
//		} // dao.close();
//		catch (Exception e) {
//			e.printStackTrace();
//		}

		try (CandidateDao dao = new CandidateDao()) {
			System.out.println("Enter the candidate name: ");
			String name = sc.next();
			System.out.println("Enter party name: ");
			String party = sc.next();
			System.out.println("Enter the number of votes: ");
			int votes = sc.nextInt();

			Candidate cand = new Candidate();
			cand.setName(name);
			cand.setParty(party);
			cand.setVotes(votes);
			int saveResult = dao.save(cand);
			System.out.println("Rows updated: " + saveResult);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		try (CandidateDao dao = new CandidateDao()) {
			System.out.println("id to be updated");
			int id = sc.nextInt();
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the party");
			String party = sc.next();

			Candidate cand1 = new Candidate();

			cand1.setId(id);
			cand1.setName(name);
			cand1.setParty(party);

			int update = dao.update(cand1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		try (CandidateDao dao = new CandidateDao())
	{
//			System.out.print("Enter party: ");
//			String party = sc.next();
			List<PartyVotes> partyVotesList = dao.getPartywiseVotes();
			partyVotesList.forEach(c -> System.out.println(c));
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
