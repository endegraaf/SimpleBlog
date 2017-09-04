Feature: Blog
  As a blog visitor
  I want to see blog posts
  So that I can see what's going on

  @primary
  Scenario: blog visitor
    Given I am a blog visitor
    When I open the blog
    Then I see the latest blog posts
#
#  Scenario:
#    Given I am a blog editor
#    When I log into the blog using a username and password
#    Then I should be logged and see additional functionality only visible to editors
#
#  Scenario:
#    Given I am a blog editor
#    When I log into the blog
#    And there are existing blog posts
#    Then I should be able to Edit the blog content
#
#  Scenario:
#    Given I am a blog editor
#    When I log in to the blog
#    Then I should be able to Create a new post
#    And I should be able to Delete a new post
