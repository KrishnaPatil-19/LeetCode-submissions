type Counter = {
    increment: () => number,
    decrement: () => number,
    reset: () => number,
}

function createCounter(init: number): Counter {

    let num: number = init;
    function increment(): number {
        return ++num;
    }

    function decrement(): number {
        return --num;
    }

    function reset(): number {
        return num = init;
    }

    return {
        increment,
        decrement,
        reset
    };
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */