.class abstract Lblb;
.super Lbkz;
.source "PG"


# instance fields
.field final b:Ljava/lang/CharSequence;

.field private c:Z

.field private d:I


# direct methods
.method protected constructor <init>(Lbkv;Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 567
    .line 1597
    invoke-direct {p0}, Lbkz;-><init>()V

    .line 565
    const/4 v0, 0x0

    iput v0, p0, Lblb;->d:I

    .line 2493
    iget-boolean v0, p1, Lbkv;->a:Z

    .line 568
    iput-boolean v0, p0, Lblb;->c:Z

    .line 569
    iput-object p2, p0, Lblb;->b:Ljava/lang/CharSequence;

    .line 570
    return-void
.end method


# virtual methods
.method abstract a(I)I
.end method

.method protected final synthetic a()Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 557
    .line 2574
    :cond_0
    iget v0, p0, Lblb;->d:I

    if-eq v0, v3, :cond_3

    .line 2575
    iget v1, p0, Lblb;->d:I

    .line 2578
    iget v0, p0, Lblb;->d:I

    invoke-virtual {p0, v0}, Lblb;->a(I)I

    move-result v0

    .line 2579
    if-ne v0, v3, :cond_2

    .line 2580
    iget-object v0, p0, Lblb;->b:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 2581
    iput v3, p0, Lblb;->d:I

    .line 2587
    :goto_0
    iget-boolean v2, p0, Lblb;->c:Z

    if-eqz v2, :cond_1

    if-eq v1, v0, :cond_0

    .line 2591
    :cond_1
    iget-object v2, p0, Lblb;->b:Ljava/lang/CharSequence;

    invoke-interface {v2, v1, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    .line 2584
    :cond_2
    invoke-virtual {p0, v0}, Lblb;->b(I)I

    move-result v2

    iput v2, p0, Lblb;->d:I

    goto :goto_0

    .line 2609
    :cond_3
    sget v0, Lbla;->c:I

    iput v0, p0, Lbkz;->a:I

    .line 2593
    const/4 v0, 0x0

    .line 557
    goto :goto_1
.end method

.method abstract b(I)I
.end method
