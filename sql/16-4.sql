select ISSUES.*,ISSUESLISTS.* from issues,issueslists
where issues.ISSUESLIST_ID = ISSUESLISTS.ID;

select ISSUES.*,users.* from issues,users
where issues.ID = users.ID;

select USERS.FIRSTNAME,USERS.LASTNAME,issues.*,COUNT(*)
    AS ISSUES_QUANTITY FROM users,issues;
