.class final Layc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:[I

.field final synthetic b:I

.field final synthetic c:Ldbf;

.field private synthetic d:Laxy;


# direct methods
.method constructor <init>(Laxy;[IILdbf;)V
    .locals 0

    .prologue
    .line 164
    iput-object p1, p0, Layc;->d:Laxy;

    iput-object p2, p0, Layc;->a:[I

    iput p3, p0, Layc;->b:I

    iput-object p4, p0, Layc;->c:Ldbf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 167
    iget-object v0, p0, Layc;->d:Laxy;

    .line 2037
    iget-object v0, v0, Laxy;->m:Landroid/support/v7/widget/RecyclerView;

    .line 167
    iget-object v1, p0, Layc;->a:[I

    iget v2, p0, Layc;->b:I

    aget v1, v1, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/RecyclerView;->scrollBy(II)V

    .line 168
    iget-object v0, p0, Layc;->d:Laxy;

    .line 3037
    iget-object v0, v0, Laxy;->m:Landroid/support/v7/widget/RecyclerView;

    .line 168
    new-instance v1, Layd;

    invoke-direct {v1, p0}, Layd;-><init>(Layc;)V

    .line 3216
    iput-object v1, v0, Landroid/support/v7/widget/RecyclerView;->o:Lzj;

    .line 187
    return-void
.end method
