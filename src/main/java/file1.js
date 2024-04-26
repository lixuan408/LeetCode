function findMajor(arr) {
    let count = 0;
    let candi = null;

    for (let num of arr) {
        if (count === 0) {
            candi = num;
        }
        count += (num === candi) ? 1 : -1
    }

    count = 0;
    for(let num of arr){
        if(num===candi){
            count++;
        }
    }
    return count>arr.length/2 ? candi :"没有主元素！"
}