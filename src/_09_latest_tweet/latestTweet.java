package _09_latest_tweet;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class latestTweet implements MouseListener {
	JFrame f = new JFrame();
			JPanel p = new JPanel();
			JTextField jtf = new JTextField(10);
			JButton tweet = new JButton();
public void run() {
	tweet.setText("Search the Twitterverse");
tweet.addMouseListener(this);
p.add(jtf);
p.add(tweet);
f.add(p);
f.setVisible(true);
f.setTitle("The Amazing Tweet Retriever");
f.pack();

}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
System.out.println("Tweet Tweet");
System.out.println(getLatestTweet(String.valueOf(jtf.getText())));

}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
private String getLatestTweet(String searchingFor) {

    Twitter twitter = new TwitterFactory().getInstance();

    AccessToken accessToken = new AccessToken(
        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
    twitter.setOAuthAccessToken(accessToken);

Query query = new Query(searchingFor);
    try {
        QueryResult result = twitter.search(query);
        return result.getTweets().get(0).getText();
    } catch (Exception e) {
        System.err.print(e.getMessage());
        return "What the heck is that?";
    }
}
}
