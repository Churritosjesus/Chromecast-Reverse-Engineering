.class public Leo;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:[Ljava/lang/Object;

.field b:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 2090
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2094
    const/16 v0, 0x1e

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Leo;->a:[Ljava/lang/Object;

    .line 2095
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 1100
    iget v0, p0, Leo;->b:I

    if-lez v0, :cond_0

    .line 1101
    iget v0, p0, Leo;->b:I

    add-int/lit8 v2, v0, -0x1

    .line 1102
    iget-object v0, p0, Leo;->a:[Ljava/lang/Object;

    aget-object v0, v0, v2

    .line 1103
    iget-object v3, p0, Leo;->a:[Ljava/lang/Object;

    aput-object v1, v3, v2

    .line 1104
    iget v1, p0, Leo;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Leo;->b:I

    .line 1107
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 1112
    invoke-virtual {p0, p1}, Leo;->b(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1113
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already in the pool!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1115
    :cond_0
    iget v0, p0, Leo;->b:I

    iget-object v1, p0, Leo;->a:[Ljava/lang/Object;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 1116
    iget-object v0, p0, Leo;->a:[Ljava/lang/Object;

    iget v1, p0, Leo;->b:I

    aput-object p1, v0, v1

    .line 1117
    iget v0, p0, Leo;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Leo;->b:I

    .line 1118
    const/4 v0, 0x1

    .line 1120
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method b(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 2124
    move v0, v1

    :goto_0
    iget v2, p0, Leo;->b:I

    if-ge v0, v2, :cond_0

    .line 2125
    iget-object v2, p0, Leo;->a:[Ljava/lang/Object;

    aget-object v2, v2, v0

    if-ne v2, p1, :cond_1

    .line 2126
    const/4 v1, 0x1

    .line 2129
    :cond_0
    return v1

    .line 2124
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
