webpackJsonp([2],{0:function(module,exports,__webpack_require__){"use strict";Object.defineProperty(exports,"__esModule",{value:!0});var obj,_PageDemo=__webpack_require__(71),_PageDemo2=(obj=_PageDemo)&&obj.__esModule?obj:{default:obj};exports.default=_PageDemo2.default,module.exports=exports.default},30:function(module,exports){"use strict";Object.defineProperty(exports,"__esModule",{value:!0}),exports.default=function(_ref){var _ref$data=_ref.data,data=void 0===_ref$data?[]:_ref$data,jsx=null;return data.length&&(jsx=data.map(function(l,k){return React.createElement("p",{key:k},l.workNo+"-"+l.name+"("+l.nickName+")")})),React.createElement("div",{className:"mod-search-data"},React.createElement("div",null,React.createElement("h3",null,"匹配的员工:"),React.createElement("div",null,jsx)))},module.exports=exports.default},31:function(module,exports,__webpack_require__){"use strict";Object.defineProperty(exports,"__esModule",{value:!0});var obj,_SearchData=__webpack_require__(30),_SearchData2=(obj=_SearchData)&&obj.__esModule?obj:{default:obj};exports.default=_SearchData2.default,module.exports=exports.default},32:function(module,exports,__webpack_require__){"use strict";Object.defineProperty(exports,"__esModule",{value:!0}),exports.default=void 0;var _createClass=function(){function defineProperties(target,props){for(var i=0;i<props.length;i++){var descriptor=props[i];descriptor.enumerable=descriptor.enumerable||!1,descriptor.configurable=!0,"value"in descriptor&&(descriptor.writable=!0),Object.defineProperty(target,descriptor.key,descriptor)}}return function(Constructor,protoProps,staticProps){return protoProps&&defineProperties(Constructor.prototype,protoProps),staticProps&&defineProperties(Constructor,staticProps),Constructor}}(),_react=__webpack_require__(1);var SearchWord=function(_Component){function SearchWord(){return function(instance,Constructor){if(!(instance instanceof Constructor))throw new TypeError("Cannot call a class as a function")}(this,SearchWord),function(self,call){if(!self)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!call||"object"!=typeof call&&"function"!=typeof call?self:call}(this,(SearchWord.__proto__||Object.getPrototypeOf(SearchWord)).apply(this,arguments))}return function(subClass,superClass){if("function"!=typeof superClass&&null!==superClass)throw new TypeError("Super expression must either be null or a function, not "+typeof superClass);subClass.prototype=Object.create(superClass&&superClass.prototype,{constructor:{value:subClass,enumerable:!1,writable:!0,configurable:!0}}),superClass&&(Object.setPrototypeOf?Object.setPrototypeOf(subClass,superClass):subClass.__proto__=superClass)}(SearchWord,_react.Component),_createClass(SearchWord,[{key:"render",value:function(){var workNo=this.props.workNo,jsx=null;return workNo&&(jsx=React.createElement("div",null,React.createElement("h3",null,"检索词:"),React.createElement("div",null,workNo))),React.createElement("div",{className:"mod-search-word"},jsx)}}]),SearchWord}();exports.default=SearchWord,module.exports=exports.default},33:function(module,exports,__webpack_require__){"use strict";Object.defineProperty(exports,"__esModule",{value:!0});var obj,_SearchWord=__webpack_require__(32),_SearchWord2=(obj=_SearchWord)&&obj.__esModule?obj:{default:obj};exports.default=_SearchWord2.default,module.exports=exports.default},47:function(module,exports,__webpack_require__){module.exports=__webpack_require__(49)},49:function(module,exports,__webpack_require__){var g=function(){return this}()||Function("return this")(),hadRuntime=g.regeneratorRuntime&&Object.getOwnPropertyNames(g).indexOf("regeneratorRuntime")>=0,oldRuntime=hadRuntime&&g.regeneratorRuntime;if(g.regeneratorRuntime=void 0,module.exports=__webpack_require__(50),hadRuntime)g.regeneratorRuntime=oldRuntime;else try{delete g.regeneratorRuntime}catch(e){g.regeneratorRuntime=void 0}},50:function(module,exports){!function(global){"use strict";var undefined,Op=Object.prototype,hasOwn=Op.hasOwnProperty,$Symbol="function"==typeof Symbol?Symbol:{},iteratorSymbol=$Symbol.iterator||"@@iterator",asyncIteratorSymbol=$Symbol.asyncIterator||"@@asyncIterator",toStringTagSymbol=$Symbol.toStringTag||"@@toStringTag",inModule="object"==typeof module,runtime=global.regeneratorRuntime;if(runtime)inModule&&(module.exports=runtime);else{(runtime=global.regeneratorRuntime=inModule?module.exports:{}).wrap=wrap;var GenStateSuspendedStart="suspendedStart",GenStateSuspendedYield="suspendedYield",GenStateExecuting="executing",GenStateCompleted="completed",ContinueSentinel={},IteratorPrototype={};IteratorPrototype[iteratorSymbol]=function(){return this};var getProto=Object.getPrototypeOf,NativeIteratorPrototype=getProto&&getProto(getProto(values([])));NativeIteratorPrototype&&NativeIteratorPrototype!==Op&&hasOwn.call(NativeIteratorPrototype,iteratorSymbol)&&(IteratorPrototype=NativeIteratorPrototype);var Gp=GeneratorFunctionPrototype.prototype=Generator.prototype=Object.create(IteratorPrototype);GeneratorFunction.prototype=Gp.constructor=GeneratorFunctionPrototype,GeneratorFunctionPrototype.constructor=GeneratorFunction,GeneratorFunctionPrototype[toStringTagSymbol]=GeneratorFunction.displayName="GeneratorFunction",runtime.isGeneratorFunction=function(genFun){var ctor="function"==typeof genFun&&genFun.constructor;return!!ctor&&(ctor===GeneratorFunction||"GeneratorFunction"===(ctor.displayName||ctor.name))},runtime.mark=function(genFun){return Object.setPrototypeOf?Object.setPrototypeOf(genFun,GeneratorFunctionPrototype):(genFun.__proto__=GeneratorFunctionPrototype,toStringTagSymbol in genFun||(genFun[toStringTagSymbol]="GeneratorFunction")),genFun.prototype=Object.create(Gp),genFun},runtime.awrap=function(arg){return{__await:arg}},defineIteratorMethods(AsyncIterator.prototype),AsyncIterator.prototype[asyncIteratorSymbol]=function(){return this},runtime.AsyncIterator=AsyncIterator,runtime.async=function(innerFn,outerFn,self,tryLocsList){var iter=new AsyncIterator(wrap(innerFn,outerFn,self,tryLocsList));return runtime.isGeneratorFunction(outerFn)?iter:iter.next().then(function(result){return result.done?result.value:iter.next()})},defineIteratorMethods(Gp),Gp[toStringTagSymbol]="Generator",Gp[iteratorSymbol]=function(){return this},Gp.toString=function(){return"[object Generator]"},runtime.keys=function(object){var keys=[];for(var key in object)keys.push(key);return keys.reverse(),function next(){for(;keys.length;){var key=keys.pop();if(key in object)return next.value=key,next.done=!1,next}return next.done=!0,next}},runtime.values=values,Context.prototype={constructor:Context,reset:function(skipTempReset){if(this.prev=0,this.next=0,this.sent=this._sent=undefined,this.done=!1,this.delegate=null,this.method="next",this.arg=undefined,this.tryEntries.forEach(resetTryEntry),!skipTempReset)for(var name in this)"t"===name.charAt(0)&&hasOwn.call(this,name)&&!isNaN(+name.slice(1))&&(this[name]=undefined)},stop:function(){this.done=!0;var rootRecord=this.tryEntries[0].completion;if("throw"===rootRecord.type)throw rootRecord.arg;return this.rval},dispatchException:function(exception){if(this.done)throw exception;var context=this;function handle(loc,caught){return record.type="throw",record.arg=exception,context.next=loc,caught&&(context.method="next",context.arg=undefined),!!caught}for(var i=this.tryEntries.length-1;i>=0;--i){var entry=this.tryEntries[i],record=entry.completion;if("root"===entry.tryLoc)return handle("end");if(entry.tryLoc<=this.prev){var hasCatch=hasOwn.call(entry,"catchLoc"),hasFinally=hasOwn.call(entry,"finallyLoc");if(hasCatch&&hasFinally){if(this.prev<entry.catchLoc)return handle(entry.catchLoc,!0);if(this.prev<entry.finallyLoc)return handle(entry.finallyLoc)}else if(hasCatch){if(this.prev<entry.catchLoc)return handle(entry.catchLoc,!0)}else{if(!hasFinally)throw new Error("try statement without catch or finally");if(this.prev<entry.finallyLoc)return handle(entry.finallyLoc)}}}},abrupt:function(type,arg){for(var i=this.tryEntries.length-1;i>=0;--i){var entry=this.tryEntries[i];if(entry.tryLoc<=this.prev&&hasOwn.call(entry,"finallyLoc")&&this.prev<entry.finallyLoc){var finallyEntry=entry;break}}finallyEntry&&("break"===type||"continue"===type)&&finallyEntry.tryLoc<=arg&&arg<=finallyEntry.finallyLoc&&(finallyEntry=null);var record=finallyEntry?finallyEntry.completion:{};return record.type=type,record.arg=arg,finallyEntry?(this.method="next",this.next=finallyEntry.finallyLoc,ContinueSentinel):this.complete(record)},complete:function(record,afterLoc){if("throw"===record.type)throw record.arg;return"break"===record.type||"continue"===record.type?this.next=record.arg:"return"===record.type?(this.rval=this.arg=record.arg,this.method="return",this.next="end"):"normal"===record.type&&afterLoc&&(this.next=afterLoc),ContinueSentinel},finish:function(finallyLoc){for(var i=this.tryEntries.length-1;i>=0;--i){var entry=this.tryEntries[i];if(entry.finallyLoc===finallyLoc)return this.complete(entry.completion,entry.afterLoc),resetTryEntry(entry),ContinueSentinel}},catch:function(tryLoc){for(var i=this.tryEntries.length-1;i>=0;--i){var entry=this.tryEntries[i];if(entry.tryLoc===tryLoc){var record=entry.completion;if("throw"===record.type){var thrown=record.arg;resetTryEntry(entry)}return thrown}}throw new Error("illegal catch attempt")},delegateYield:function(iterable,resultName,nextLoc){return this.delegate={iterator:values(iterable),resultName:resultName,nextLoc:nextLoc},"next"===this.method&&(this.arg=undefined),ContinueSentinel}}}function wrap(innerFn,outerFn,self,tryLocsList){var protoGenerator=outerFn&&outerFn.prototype instanceof Generator?outerFn:Generator,generator=Object.create(protoGenerator.prototype),context=new Context(tryLocsList||[]);return generator._invoke=function(innerFn,self,context){var state=GenStateSuspendedStart;return function(method,arg){if(state===GenStateExecuting)throw new Error("Generator is already running");if(state===GenStateCompleted){if("throw"===method)throw arg;return doneResult()}for(context.method=method,context.arg=arg;;){var delegate=context.delegate;if(delegate){var delegateResult=maybeInvokeDelegate(delegate,context);if(delegateResult){if(delegateResult===ContinueSentinel)continue;return delegateResult}}if("next"===context.method)context.sent=context._sent=context.arg;else if("throw"===context.method){if(state===GenStateSuspendedStart)throw state=GenStateCompleted,context.arg;context.dispatchException(context.arg)}else"return"===context.method&&context.abrupt("return",context.arg);state=GenStateExecuting;var record=tryCatch(innerFn,self,context);if("normal"===record.type){if(state=context.done?GenStateCompleted:GenStateSuspendedYield,record.arg===ContinueSentinel)continue;return{value:record.arg,done:context.done}}"throw"===record.type&&(state=GenStateCompleted,context.method="throw",context.arg=record.arg)}}}(innerFn,self,context),generator}function tryCatch(fn,obj,arg){try{return{type:"normal",arg:fn.call(obj,arg)}}catch(err){return{type:"throw",arg:err}}}function Generator(){}function GeneratorFunction(){}function GeneratorFunctionPrototype(){}function defineIteratorMethods(prototype){["next","throw","return"].forEach(function(method){prototype[method]=function(arg){return this._invoke(method,arg)}})}function AsyncIterator(generator){var previousPromise;this._invoke=function(method,arg){function callInvokeWithMethodAndArg(){return new Promise(function(resolve,reject){!function invoke(method,arg,resolve,reject){var record=tryCatch(generator[method],generator,arg);if("throw"!==record.type){var result=record.arg,value=result.value;return value&&"object"==typeof value&&hasOwn.call(value,"__await")?Promise.resolve(value.__await).then(function(value){invoke("next",value,resolve,reject)},function(err){invoke("throw",err,resolve,reject)}):Promise.resolve(value).then(function(unwrapped){result.value=unwrapped,resolve(result)},reject)}reject(record.arg)}(method,arg,resolve,reject)})}return previousPromise=previousPromise?previousPromise.then(callInvokeWithMethodAndArg,callInvokeWithMethodAndArg):callInvokeWithMethodAndArg()}}function maybeInvokeDelegate(delegate,context){var method=delegate.iterator[context.method];if(method===undefined){if(context.delegate=null,"throw"===context.method){if(delegate.iterator.return&&(context.method="return",context.arg=undefined,maybeInvokeDelegate(delegate,context),"throw"===context.method))return ContinueSentinel;context.method="throw",context.arg=new TypeError("The iterator does not provide a 'throw' method")}return ContinueSentinel}var record=tryCatch(method,delegate.iterator,context.arg);if("throw"===record.type)return context.method="throw",context.arg=record.arg,context.delegate=null,ContinueSentinel;var info=record.arg;return info?info.done?(context[delegate.resultName]=info.value,context.next=delegate.nextLoc,"return"!==context.method&&(context.method="next",context.arg=undefined),context.delegate=null,ContinueSentinel):info:(context.method="throw",context.arg=new TypeError("iterator result is not an object"),context.delegate=null,ContinueSentinel)}function pushTryEntry(locs){var entry={tryLoc:locs[0]};1 in locs&&(entry.catchLoc=locs[1]),2 in locs&&(entry.finallyLoc=locs[2],entry.afterLoc=locs[3]),this.tryEntries.push(entry)}function resetTryEntry(entry){var record=entry.completion||{};record.type="normal",delete record.arg,entry.completion=record}function Context(tryLocsList){this.tryEntries=[{tryLoc:"root"}],tryLocsList.forEach(pushTryEntry,this),this.reset(!0)}function values(iterable){if(iterable){var iteratorMethod=iterable[iteratorSymbol];if(iteratorMethod)return iteratorMethod.call(iterable);if("function"==typeof iterable.next)return iterable;if(!isNaN(iterable.length)){var i=-1,next=function next(){for(;++i<iterable.length;)if(hasOwn.call(iterable,i))return next.value=iterable[i],next.done=!1,next;return next.value=undefined,next.done=!0,next};return next.next=next}}return{next:doneResult}}function doneResult(){return{value:undefined,done:!0}}}(function(){return this}()||Function("return this")())},71:function(module,exports,__webpack_require__){"use strict";var _createClass=function(){function defineProperties(target,props){for(var i=0;i<props.length;i++){var descriptor=props[i];descriptor.enumerable=descriptor.enumerable||!1,descriptor.configurable=!0,"value"in descriptor&&(descriptor.writable=!0),Object.defineProperty(target,descriptor.key,descriptor)}}return function(Constructor,protoProps,staticProps){return protoProps&&defineProperties(Constructor.prototype,protoProps),staticProps&&defineProperties(Constructor,staticProps),Constructor}}(),_refast=__webpack_require__(51),_reactDom=__webpack_require__(10),_searchWord2=_interopRequireDefault(__webpack_require__(33)),_searchData2=_interopRequireDefault(__webpack_require__(31));__webpack_require__(118);var logic=function(obj){if(obj&&obj.__esModule)return obj;var newObj={};if(null!=obj)for(var key in obj)Object.prototype.hasOwnProperty.call(obj,key)&&(newObj[key]=obj[key]);return newObj.default=obj,newObj}(__webpack_require__(72));function _interopRequireDefault(obj){return obj&&obj.__esModule?obj:{default:obj}}var PageDemo=function(_Component){function PageDemo(props){!function(instance,Constructor){if(!(instance instanceof Constructor))throw new TypeError("Cannot call a class as a function")}(this,PageDemo);var _this=function(self,call){if(!self)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!call||"object"!=typeof call&&"function"!=typeof call?self:call}(this,(PageDemo.__proto__||Object.getPrototypeOf(PageDemo)).call(this,props,logic));return _this.handleChange=_this.handleChange.bind(_this),_this}return function(subClass,superClass){if("function"!=typeof superClass&&null!==superClass)throw new TypeError("Super expression must either be null or a function, not "+typeof superClass);subClass.prototype=Object.create(superClass&&superClass.prototype,{constructor:{value:subClass,enumerable:!1,writable:!0,configurable:!0}}),superClass&&(Object.setPrototypeOf?Object.setPrototypeOf(subClass,superClass):subClass.__proto__=superClass)}(PageDemo,_refast.Component),_createClass(PageDemo,[{key:"handleChange",value:function(e){this.dispatch("updateState",{workNo:e.target.value})}},{key:"render",value:function(){var _state=this.state,data=_state.data,workNo=_state.workNo,empty=_state.empty,handleChange=this.handleChange;return React.createElement("div",{className:"page-demo"},React.createElement("input",{className:"kuma-input",onChange:handleChange,placeholder:"请输入员工工号",value:workNo}),React.createElement(_searchWord2.default,{workNo:workNo}),React.createElement(_refast.LogicRender,{empty:empty,awareOf:{workNo:workNo},action:"search"},React.createElement(_searchData2.default,{data:data})))}}]),PageDemo}();(0,_reactDom.render)(React.createElement(PageDemo,null),document.getElementById("App"))},72:function(module,exports,__webpack_require__){"use strict";Object.defineProperty(exports,"__esModule",{value:!0}),exports.search=void 0;var obj,fn,_ref,_regenerator=__webpack_require__(47),_regenerator2=(obj=_regenerator)&&obj.__esModule?obj:{default:obj},_extends=Object.assign||function(target){for(var i=1;i<arguments.length;i++){var source=arguments[i];for(var key in source)Object.prototype.hasOwnProperty.call(source,key)&&(target[key]=source[key])}return target};exports.search=(fn=_regenerator2.default.mark(function _callee(ctx){var setState,getState,_ctx$fn,message,DB,_getState,workNo,state,users,empty;return _regenerator2.default.wrap(function(_context){for(;;)switch(_context.prev=_context.next){case 0:return setState=ctx.setState,getState=ctx.getState,_ctx$fn=ctx.fn,message=_ctx$fn.message,DB=_ctx$fn.DB,_getState=getState(),workNo=_getState.workNo,state={},_context.prev=3,_context.next=6,DB.User.query({workNo:workNo});case 6:users=_context.sent,(empty=!users.data.length)&&message.info(workNo+"查无数据！"),state=_extends({},users,{empty:empty}),_context.next=16;break;case 12:_context.prev=12,_context.t0=_context.catch(3),message.error(workNo+"请求出错啦！"),state={users:[],empty:!1};case 16:setState(state);case 17:case"end":return _context.stop()}},_callee,this,[[3,12]])}),_ref=function(){var gen=fn.apply(this,arguments);return new Promise(function(resolve,reject){return function step(key,arg){try{var info=gen[key](arg),value=info.value}catch(error){return void reject(error)}if(!info.done)return Promise.resolve(value).then(function(value){step("next",value)},function(err){step("throw",err)});resolve(value)}("next")})},function(_x){return _ref.apply(this,arguments)});exports.defaults=function(props){return{empty:props.empty||!0,workNo:""}},exports.updateState=function(ctx,data){ctx.setState(data)}},118:function(module,exports){}});