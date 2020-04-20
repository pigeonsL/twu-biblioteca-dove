select member.name,count(*)
from member,checkout_item
where member.id=checkout_item.member_id
group by member_id
having count(*)>=2;