-- 코드를 입력하세요
SELECT TITLE, BOARD_ID, REPLY_ID, WRITER_ID, CONTENTS, 
-- 날짜 포맷(YYYY-MM-DD)
DATE_FORMAT(CREATED_DATE,'%Y-%m-%d') as CREATED_DATE from (
    SELECT 
    a.TITLE, a.BOARD_ID, b.REPLY_ID, B.WRITER_ID
    ,b.CONTENTS, b.CREATED_DATE
    from USED_GOODS_BOARD a inner join USED_GOODS_REPLY b
    -- 같은 아이디로
    on a.BOARD_ID = b.BOARD_ID
    -- 날짜 검색
    where a.created_date >= '2022-10-01 00:00:00'
    and a.created_date <= '2022-10-31 23:59:59'
    ) tab
order by tab.CREATED_DATE asc, TITLE asc