<template>
  <div>
    <div class="card-head">
      <span>{{title}}</span>
      <svg t="1652530117522" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="1252" width="16" height="16"><path d="M512 958.016C266.08 958.016 65.984 757.952 65.984 512 65.984 266.08 266.08 65.984 512 65.984c245.952 0 446.016 200.064 446.016 446.016C958.016 757.952 757.952 958.016 512 958.016zM512 129.984C301.344 129.984 129.984 301.344 129.984 512c0 210.624 171.36 382.016 382.016 382.016 210.624 0 382.016-171.36 382.016-382.016C894.016 301.344 722.624 129.984 512 129.984z" p-id="1253" fill="#cdcdcd"></path><path d="M512 304m-48 0a1.5 1.5 0 1 0 96 0 1.5 1.5 0 1 0-96 0Z" p-id="1254" fill="#cdcdcd"></path><path d="M512 768c-17.664 0-32-14.304-32-32l0-288c0-17.664 14.336-32 32-32s32 14.336 32 32l0 288C544 753.696 529.664 768 512 768z" p-id="1255" fill="#cdcdcd"></path></svg>
    </div>
    <div class="card-container">
      {{count}}
    </div>
    <div class="card-charts">
      <slot name="charts"></slot>
    </div>
    <div class="card-footer">
      <slot name="footer"></slot>
    </div>
  </div>
</template>

<script>
export default {
  props:['title','count']
}
</script>

<style scoped>
.card-head{
  display: flex;
  justify-content: space-between;
  color:#ccc;
  font-size: 12px;
}
.card-container{
  font-size: 30px;
  padding: 10px 0px;
}
.card-charts{
  width: 100%;
  font-size: 12px;
  height: 50px;
}
.card-footer{
  border-top: 1px solid #ccc;
  padding: 5px 0px;
  font-size: 12px;
  color: skyblue;
}
</style>