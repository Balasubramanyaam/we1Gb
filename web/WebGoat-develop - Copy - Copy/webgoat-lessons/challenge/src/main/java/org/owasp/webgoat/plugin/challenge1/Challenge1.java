package org.owasp.webgoat.plugin.challenge1;

import com.google.common.collect.Lists;
import org.owasp.webgoat.lessons.Category;
import org.owasp.webgoat.lessons.NewLesson;

import java.util.List;

/**
 * @author nbaars
 * @since 3/21/17.
 */
public class Challenge1 extends NewLesson {

    @Override
    public Category getDefaultCategory() {
        return Category.CHALLENGE;
    }

    @Override
    public List<String> getHints() {
        return Lists.newArrayList();
    }

    @Override
    public Integer getDefaultRanking() {
        return 10;
    }

    @Override
    public String getTitle() {
        return "challenge1.title";
    }

    @Override
    public String getId() {
        return "Challenge1";
    }
}
