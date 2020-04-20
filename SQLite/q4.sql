insert into book
values(NULL,'The Pragmatic Programmer');

insert into member
values(NULL,'Jinge Li');

insert into checkout_item
values(43,11,NULL);

select member.name from member,checkout_item,book
where member.id = checkout_item.member_id and book.id=checkout_item.book_id and book.title="The Pragmatic Programmer"
