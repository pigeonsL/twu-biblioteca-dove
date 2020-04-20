select member.name
from member,checkout_item,book
where member.id = checkout_item.member_id
and book.id=checkout_item.book_id
and book.title="The Hobbit"