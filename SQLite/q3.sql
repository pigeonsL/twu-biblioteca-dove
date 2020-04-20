select distinct title
from book
left join checkout_item
on id=book_id
where member_id is null;

select distinct title
from movie
left join checkout_item
on id=movie_id
where member_id is null;