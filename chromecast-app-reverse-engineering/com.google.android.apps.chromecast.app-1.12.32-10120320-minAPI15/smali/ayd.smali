.class final Layd;
.super Lzj;
.source "PG"


# instance fields
.field private synthetic a:Layc;


# direct methods
.method constructor <init>(Layc;)V
    .locals 0

    .prologue
    .line 168
    iput-object p1, p0, Layd;->a:Layc;

    invoke-direct {p0}, Lzj;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 171
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 172
    const/16 v0, 0x75

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    iget-object v1, p0, Layd;->a:Layc;

    iget v1, v1, Layc;->b:I

    .line 173
    invoke-virtual {v0, v1}, Lapg;->b(I)Lapg;

    move-result-object v0

    iget-object v1, p0, Layd;->a:Layc;

    iget-object v1, v1, Layc;->c:Ldbf;

    iget-object v1, v1, Ldbf;->e:Ljava/lang/String;

    .line 1084
    iput-object v1, v0, Lapg;->b:Ljava/lang/String;

    .line 175
    invoke-virtual {v0}, Lapg;->b()V

    .line 177
    :cond_0
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 3

    .prologue
    .line 181
    invoke-super {p0, p1, p2, p3}, Lzj;->a(Landroid/support/v7/widget/RecyclerView;II)V

    .line 182
    iget-object v0, p0, Layd;->a:Layc;

    iget-object v0, v0, Layc;->a:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Layd;->a:Layc;

    iget-object v0, v0, Layc;->a:[I

    iget-object v1, p0, Layd;->a:Layc;

    iget v1, v1, Layc;->b:I

    aget v0, v0, v1

    if-eq p2, v0, :cond_0

    .line 183
    iget-object v0, p0, Layd;->a:Layc;

    iget-object v0, v0, Layc;->a:[I

    iget-object v1, p0, Layd;->a:Layc;

    iget v1, v1, Layc;->b:I

    aget v2, v0, v1

    add-int/2addr v2, p2

    aput v2, v0, v1

    .line 185
    :cond_0
    return-void
.end method
