.class public abstract Lxt;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Landroid/util/SparseIntArray;

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 656
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 658
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lxt;->a:Landroid/util/SparseIntArray;

    .line 660
    const/4 v0, 0x0

    iput-boolean v0, p0, Lxt;->b:Z

    return-void
.end method


# virtual methods
.method public a(II)I
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 736
    if-ne v2, p2, :cond_1

    .line 762
    :cond_0
    :goto_0
    return v1

    :cond_1
    move v3, v1

    move v0, v1

    .line 749
    :goto_1
    if-ge v3, p1, :cond_4

    .line 751
    add-int/lit8 v0, v0, 0x1

    .line 752
    if-ne v0, p2, :cond_3

    move v0, v1

    .line 749
    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 754
    :cond_3
    if-le v0, p2, :cond_2

    move v0, v2

    .line 756
    goto :goto_2

    .line 759
    :cond_4
    add-int/lit8 v2, v0, 0x1

    if-gt v2, p2, :cond_0

    move v1, v0

    .line 760
    goto :goto_0
.end method

.method public final b(II)I
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 796
    move v3, v2

    move v0, v2

    move v1, v2

    .line 799
    :goto_0
    if-ge v3, p1, :cond_2

    .line 801
    add-int/lit8 v1, v1, 0x1

    .line 802
    if-ne v1, p2, :cond_1

    .line 804
    add-int/lit8 v0, v0, 0x1

    move v1, v2

    .line 799
    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 805
    :cond_1
    if-le v1, p2, :cond_0

    .line 807
    const/4 v1, 0x1

    .line 808
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 811
    :cond_2
    add-int/lit8 v1, v1, 0x1

    if-le v1, p2, :cond_3

    .line 812
    add-int/lit8 v0, v0, 0x1

    .line 814
    :cond_3
    return v0
.end method
