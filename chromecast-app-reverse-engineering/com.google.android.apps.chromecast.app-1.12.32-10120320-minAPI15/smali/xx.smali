.class final Lxx;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:I

.field b:I

.field c:Z

.field final synthetic d:Lxw;


# direct methods
.method constructor <init>(Lxw;)V
    .locals 0

    .prologue
    .line 2087
    iput-object p1, p0, Lxx;->d:Lxw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 1

    .prologue
    .line 2102
    iget-boolean v0, p0, Lxx;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxx;->d:Lxw;

    iget-object v0, v0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->c()I

    move-result v0

    :goto_0
    iput v0, p0, Lxx;->b:I

    .line 2105
    return-void

    .line 2102
    :cond_0
    iget-object v0, p0, Lxx;->d:Lxw;

    iget-object v0, v0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->b()I

    move-result v0

    goto :goto_0
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 2170
    iget-boolean v0, p0, Lxx;->c:Z

    if-eqz v0, :cond_0

    .line 2171
    iget-object v0, p0, Lxx;->d:Lxw;

    iget-object v0, v0, Lxw;->b:Lyq;

    invoke-virtual {v0, p1}, Lyq;->b(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Lxx;->d:Lxw;

    iget-object v1, v1, Lxw;->b:Lyq;

    invoke-virtual {v1}, Lyq;->a()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lxx;->b:I

    .line 2177
    :goto_0
    invoke-static {p1}, Lxw;->a(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Lxx;->a:I

    .line 2178
    return-void

    .line 2174
    :cond_0
    iget-object v0, p0, Lxx;->d:Lxw;

    iget-object v0, v0, Lxw;->b:Lyq;

    invoke-virtual {v0, p1}, Lyq;->a(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Lxx;->b:I

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 2109
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AnchorInfo{mPosition="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lxx;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mCoordinate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lxx;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mLayoutFromEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lxx;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
