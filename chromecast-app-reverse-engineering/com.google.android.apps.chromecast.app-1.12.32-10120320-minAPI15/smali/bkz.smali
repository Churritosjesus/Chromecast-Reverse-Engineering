.class abstract Lbkz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field a:I

.field private b:Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 597
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 598
    sget v0, Lbla;->b:I

    iput v0, p0, Lbkz;->a:I

    .line 600
    return-void
.end method


# virtual methods
.method protected abstract a()Ljava/lang/Object;
.end method

.method public final hasNext()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 615
    iget v2, p0, Lbkz;->a:I

    sget v3, Lbla;->d:I

    if-ne v2, v3, :cond_0

    .line 616
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 619
    :cond_0
    sget-object v2, Lbkt;->a:[I

    iget v3, p0, Lbkz;->a:I

    add-int/lit8 v3, v3, -0x1

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 1630
    sget v2, Lbla;->d:I

    iput v2, p0, Lbkz;->a:I

    .line 1631
    invoke-virtual {p0}, Lbkz;->a()Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lbkz;->b:Ljava/lang/Object;

    .line 1632
    iget v2, p0, Lbkz;->a:I

    sget v3, Lbla;->c:I

    if-eq v2, v3, :cond_1

    .line 1633
    sget v0, Lbla;->a:I

    iput v0, p0, Lbkz;->a:I

    move v0, v1

    .line 1634
    :cond_1
    :goto_0
    :pswitch_0
    return v0

    :pswitch_1
    move v0, v1

    .line 623
    goto :goto_0

    .line 619
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 641
    invoke-virtual {p0}, Lbkz;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 642
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 644
    :cond_0
    sget v0, Lbla;->b:I

    iput v0, p0, Lbkz;->a:I

    .line 645
    iget-object v0, p0, Lbkz;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public remove()V
    .locals 1

    .prologue
    .line 650
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
