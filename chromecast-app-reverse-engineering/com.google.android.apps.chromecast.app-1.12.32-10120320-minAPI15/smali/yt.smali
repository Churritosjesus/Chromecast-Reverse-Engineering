.class public final Lyt;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lqb;
.implements Lqq;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lqa;

.field public c:Lqn;

.field public d:Lwg;

.field private e:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;I)V
    .locals 6

    .prologue
    .line 85
    const/4 v3, 0x5

    sget v4, La;->L:I

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lyt;-><init>(Landroid/content/Context;Landroid/view/View;III)V

    .line 86
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/view/View;III)V
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    iput-object p1, p0, Lyt;->a:Landroid/content/Context;

    .line 108
    new-instance v0, Lqa;

    invoke-direct {v0, p1}, Lqa;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lyt;->b:Lqa;

    .line 109
    iget-object v0, p0, Lyt;->b:Lqa;

    invoke-virtual {v0, p0}, Lqa;->a(Lqb;)V

    .line 110
    iput-object p2, p0, Lyt;->e:Landroid/view/View;

    .line 111
    new-instance v0, Lqn;

    iget-object v2, p0, Lyt;->b:Lqa;

    move-object v1, p1

    move-object v3, p2

    move v5, p4

    move v6, v4

    invoke-direct/range {v0 .. v6}, Lqn;-><init>(Landroid/content/Context;Lqa;Landroid/view/View;ZII)V

    iput-object v0, p0, Lyt;->c:Lqn;

    .line 112
    iget-object v0, p0, Lyt;->c:Lqn;

    .line 1121
    iput p3, v0, Lqn;->f:I

    .line 113
    iget-object v0, p0, Lyt;->c:Lqn;

    .line 1267
    iput-object p0, v0, Lqn;->d:Lqq;

    .line 114
    return-void
.end method


# virtual methods
.method public final a(Lqa;)V
    .locals 0

    .prologue
    .line 266
    return-void
.end method

.method public final a(Lqa;Z)V
    .locals 0

    .prologue
    .line 239
    return-void
.end method

.method public final a(Lqa;Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Lyt;->d:Lwg;

    if-eqz v0, :cond_0

    .line 227
    iget-object v0, p0, Lyt;->d:Lwg;

    invoke-interface {v0, p2}, Lwg;->a(Landroid/view/MenuItem;)Z

    move-result v0

    .line 229
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a_(Lqa;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 245
    if-nez p1, :cond_1

    const/4 v0, 0x0

    .line 253
    :cond_0
    :goto_0
    return v0

    .line 247
    :cond_1
    invoke-virtual {p1}, Lqa;->hasVisibleItems()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 252
    new-instance v1, Lqn;

    iget-object v2, p0, Lyt;->a:Landroid/content/Context;

    iget-object v3, p0, Lyt;->e:Landroid/view/View;

    invoke-direct {v1, v2, p1, v3}, Lqn;-><init>(Landroid/content/Context;Lqa;Landroid/view/View;)V

    invoke-virtual {v1}, Lqn;->b()V

    goto :goto_0
.end method
