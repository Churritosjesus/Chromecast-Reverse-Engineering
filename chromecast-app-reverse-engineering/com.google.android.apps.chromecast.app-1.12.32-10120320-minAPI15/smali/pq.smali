.class final Lpq;
.super Liv;
.source "PG"


# instance fields
.field private a:Z

.field private b:I

.field private synthetic c:Lpp;


# direct methods
.method constructor <init>(Lpp;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 108
    iput-object p1, p0, Lpq;->c:Lpp;

    invoke-direct {p0}, Liv;-><init>()V

    .line 109
    iput-boolean v0, p0, Lpq;->a:Z

    .line 110
    iput v0, p0, Lpq;->b:I

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 114
    iget-boolean v0, p0, Lpq;->a:Z

    if-eqz v0, :cond_1

    .line 121
    :cond_0
    :goto_0
    return-void

    .line 117
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lpq;->a:Z

    .line 118
    iget-object v0, p0, Lpq;->c:Lpp;

    .line 1033
    iget-object v0, v0, Lpp;->b:Liu;

    .line 118
    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lpq;->c:Lpp;

    .line 2033
    iget-object v0, v0, Lpp;->b:Liu;

    .line 119
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Liu;->a(Landroid/view/View;)V

    goto :goto_0
.end method

.method public final b(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 131
    iget v0, p0, Lpq;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lpq;->b:I

    iget-object v1, p0, Lpq;->c:Lpp;

    .line 3033
    iget-object v1, v1, Lpp;->a:Ljava/util/ArrayList;

    .line 131
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 132
    iget-object v0, p0, Lpq;->c:Lpp;

    .line 4033
    iget-object v0, v0, Lpp;->b:Liu;

    .line 132
    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lpq;->c:Lpp;

    .line 5033
    iget-object v0, v0, Lpp;->b:Liu;

    .line 133
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Liu;->b(Landroid/view/View;)V

    .line 5124
    :cond_0
    iput v2, p0, Lpq;->b:I

    .line 5125
    iput-boolean v2, p0, Lpq;->a:Z

    .line 5126
    iget-object v0, p0, Lpq;->c:Lpp;

    .line 6073
    iput-boolean v2, v0, Lpp;->c:Z

    .line 137
    :cond_1
    return-void
.end method
