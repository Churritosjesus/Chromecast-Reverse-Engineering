.class public final Lzk;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public a:Landroid/util/SparseArray;

.field b:Landroid/util/SparseIntArray;

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 4035
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4036
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lzk;->a:Landroid/util/SparseArray;

    .line 4038
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lzk;->b:Landroid/util/SparseIntArray;

    .line 4039
    const/4 v0, 0x0

    iput v0, p0, Lzk;->c:I

    return-void
.end method
