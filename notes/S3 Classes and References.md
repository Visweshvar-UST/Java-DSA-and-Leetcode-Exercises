---


---

<h1 id="classes-and-references">Classes and References</h1>
<h3 id="cookie-class">Cookie class</h3>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">package</span> DSA<span class="token punctuation">.</span>S2<span class="token punctuation">;</span>  
  
<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">Cookie</span> <span class="token punctuation">{</span>  
    <span class="token keyword">private</span> String color<span class="token punctuation">;</span>  
  
    <span class="token keyword">public</span> <span class="token function">Cookie</span><span class="token punctuation">(</span>String color<span class="token punctuation">)</span> <span class="token punctuation">{</span>  
        <span class="token keyword">this</span><span class="token punctuation">.</span>color <span class="token operator">=</span> color<span class="token punctuation">;</span>  
    <span class="token punctuation">}</span>  
  
    <span class="token keyword">public</span> String <span class="token function">getColor</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>  
        <span class="token keyword">return</span> color<span class="token punctuation">;</span>  
    <span class="token punctuation">}</span>  
  
    <span class="token keyword">public</span> <span class="token keyword">void</span> <span class="token function">setColor</span><span class="token punctuation">(</span>String color<span class="token punctuation">)</span> <span class="token punctuation">{</span>  
        <span class="token keyword">this</span><span class="token punctuation">.</span>color <span class="token operator">=</span> color<span class="token punctuation">;</span>  
    <span class="token punctuation">}</span>  
<span class="token punctuation">}</span>
</code></pre>
<h3 id="main-class">Main class</h3>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">package</span> DSA<span class="token punctuation">.</span>S2<span class="token punctuation">;</span>  
  
<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">Main</span> <span class="token punctuation">{</span>  
    <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span>String<span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>  
    Cookie c1 <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Cookie</span><span class="token punctuation">(</span><span class="token string">"Green"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>  
    Cookie c2 <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Cookie</span><span class="token punctuation">(</span><span class="token string">"blue"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>  
  
    System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>c1<span class="token punctuation">.</span><span class="token function">getColor</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>  
    System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>c2<span class="token punctuation">.</span><span class="token function">getColor</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>  
  
    c2<span class="token punctuation">.</span><span class="token function">setColor</span><span class="token punctuation">(</span><span class="token string">"Yellow"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>  
  
    System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>c1<span class="token punctuation">.</span><span class="token function">getColor</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>  
    System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>c2<span class="token punctuation">.</span><span class="token function">getColor</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>  
  
    <span class="token punctuation">}</span>  
<span class="token punctuation">}</span>
</code></pre>
<h3 id="references">References</h3>
<ul>
<li>reference with map of a value with hash map.</li>
<li>garbage collector deletes no variable point to a data.</li>
</ul>
<blockquote>
<p>Written with <a href="https://stackedit.io/">StackEdit</a>.</p>
</blockquote>

