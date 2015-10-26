.class final Lacw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field private synthetic a:Lacb;


# direct methods
.method constructor <init>(Lacb;)V
    .locals 0

    .prologue
    .line 2463
    iput-object p1, p0, Lacw;->a:Lacb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 2469
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2471
    iget-object v0, p0, Lacw;->a:Lacb;

    .line 2626
    invoke-virtual {v0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 2472
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-virtual {v0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    const-class v3, Lada;

    invoke-interface {v2, v1, v0, v3}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lada;

    .line 2474
    array-length v3, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v4, v0, v1

    .line 2475
    invoke-interface {v2, v4}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 2474
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2477
    :cond_0
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-static {v0}, Lacb;->o(Lacb;)Ladc;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2478
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-static {v0}, Lacb;->o(Lacb;)Ladc;

    move-result-object v0

    invoke-interface {v2, v0}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 2480
    :cond_1
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-virtual {v0}, Lacb;->d()V

    .line 2528
    :cond_2
    :goto_1
    return-void

    .line 2485
    :cond_3
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-static {v0}, Lacb;->p(Lacb;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2489
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-static {v0}, Lacb;->d(Lacb;)Lada;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 2490
    iget-object v0, p0, Lacw;->a:Lacb;

    iget-object v2, p0, Lacw;->a:Lacb;

    invoke-static {v2}, Lacb;->d(Lacb;)Lada;

    move-result-object v2

    invoke-virtual {v0, v2}, Lacb;->a(Lada;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2491
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-virtual {v0, v3}, Lacb;->setCursorVisible(Z)V

    .line 2492
    iget-object v0, p0, Lacw;->a:Lacb;

    iget-object v2, p0, Lacw;->a:Lacb;

    invoke-virtual {v2}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v2

    invoke-virtual {v0, v2}, Lacb;->setSelection(I)V

    .line 2493
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-virtual {v0}, Lacb;->d()V

    .line 2498
    :cond_4
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    .line 2501
    if-le v0, v3, :cond_2

    .line 2502
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-virtual {v0, p1}, Lacb;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2503
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-static {v0}, Lacb;->q(Lacb;)V

    goto :goto_1

    .line 2507
    :cond_5
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-virtual {v0}, Lacb;->getSelectionEnd()I

    move-result v0

    if-nez v0, :cond_6

    move v0, v1

    .line 2508
    :goto_2
    iget-object v1, p0, Lacw;->a:Lacb;

    invoke-virtual {v1}, Lacb;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 2509
    if-eq v0, v1, :cond_7

    .line 2510
    invoke-interface {p1, v0}, Landroid/text/Editable;->charAt(I)C

    move-result v0

    .line 2514
    :goto_3
    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    .line 2515
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-virtual {v0}, Lacb;->f()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2518
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-virtual {v0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2519
    iget-object v1, p0, Lacw;->a:Lacb;

    invoke-static {v1}, Lacb;->r(Lacb;)Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    move-result-object v1

    iget-object v2, p0, Lacw;->a:Lacb;

    invoke-virtual {v2}, Lacb;->getSelectionEnd()I

    move-result v2

    invoke-interface {v1, v0, v2}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenStart(Ljava/lang/CharSequence;I)I

    move-result v1

    .line 2520
    iget-object v2, p0, Lacw;->a:Lacb;

    invoke-static {v2}, Lacb;->r(Lacb;)Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenEnd(Ljava/lang/CharSequence;I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 2522
    iget-object v1, p0, Lacw;->a:Lacb;

    invoke-static {v1, v0}, Lacb;->b(Lacb;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2523
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-static {v0}, Lacb;->q(Lacb;)V

    goto/16 :goto_1

    .line 2507
    :cond_6
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-virtual {v0}, Lacb;->getSelectionEnd()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 2512
    :cond_7
    invoke-interface {p1, v1}, Landroid/text/Editable;->charAt(I)C

    move-result v0

    goto :goto_3
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 2568
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 5

    .prologue
    .line 2535
    sub-int v0, p3, p4

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 2538
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-virtual {v0}, Lacb;->getSelectionStart()I

    move-result v0

    .line 2539
    iget-object v1, p0, Lacw;->a:Lacb;

    .line 3626
    invoke-virtual {v1}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 2539
    const-class v2, Lada;

    invoke-interface {v1, v0, v0, v2}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lada;

    .line 2541
    array-length v1, v0

    if-lez v1, :cond_1

    .line 2543
    const/4 v1, 0x0

    aget-object v1, v0, v1

    .line 2544
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-virtual {v0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 2546
    invoke-interface {v2, v1}, Landroid/text/Editable;->getSpanStart(Ljava/lang/Object;)I

    move-result v3

    .line 2547
    invoke-interface {v2, v1}, Landroid/text/Editable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 2548
    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v4

    if-le v0, v4, :cond_0

    .line 2549
    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v0

    .line 2551
    :cond_0
    invoke-interface {v2, v1}, Landroid/text/Editable;->removeSpan(Ljava/lang/Object;)V

    .line 2552
    invoke-interface {v2, v3, v0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 2563
    :cond_1
    :goto_0
    return-void

    .line 2554
    :cond_2
    if-le p4, p3, :cond_1

    .line 2555
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-static {v0}, Lacb;->d(Lacb;)Lada;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lacw;->a:Lacb;

    iget-object v1, p0, Lacw;->a:Lacb;

    .line 2556
    invoke-static {v1}, Lacb;->d(Lacb;)Lada;

    move-result-object v1

    invoke-virtual {v0, v1}, Lacb;->a(Lada;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2557
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-virtual {v0, p1}, Lacb;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2558
    iget-object v0, p0, Lacw;->a:Lacb;

    invoke-static {v0}, Lacb;->q(Lacb;)V

    goto :goto_0
.end method
