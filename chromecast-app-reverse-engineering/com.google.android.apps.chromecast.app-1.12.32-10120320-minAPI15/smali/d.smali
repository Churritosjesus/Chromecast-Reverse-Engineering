.class final Ld;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field private synthetic a:Landroid/view/View;

.field private synthetic b:Ljava/lang/Object;

.field private synthetic c:Ljava/util/ArrayList;

.field private synthetic d:Lf;

.field private synthetic e:Z

.field private synthetic f:Lj;

.field private synthetic g:Lj;

.field private synthetic h:Lc;


# direct methods
.method constructor <init>(Lc;Landroid/view/View;Ljava/lang/Object;Ljava/util/ArrayList;Lf;ZLj;Lj;)V
    .locals 0

    .prologue
    .line 1234
    iput-object p1, p0, Ld;->h:Lc;

    iput-object p2, p0, Ld;->a:Landroid/view/View;

    iput-object p3, p0, Ld;->b:Ljava/lang/Object;

    iput-object p4, p0, Ld;->c:Ljava/util/ArrayList;

    iput-object p5, p0, Ld;->d:Lf;

    iput-boolean p6, p0, Ld;->e:Z

    iput-object p7, p0, Ld;->f:Lj;

    iput-object p8, p0, Ld;->g:Lj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 6

    .prologue
    .line 1237
    iget-object v0, p0, Ld;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 1239
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 1240
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    iget-object v1, p0, Ld;->c:Ljava/util/ArrayList;

    invoke-static {v0, v1}, La;->a(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 1242
    iget-object v0, p0, Ld;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1244
    iget-object v0, p0, Ld;->h:Lc;

    iget-object v1, p0, Ld;->d:Lf;

    iget-boolean v2, p0, Ld;->e:Z

    iget-object v3, p0, Ld;->f:Lj;

    invoke-static {v0, v1, v2, v3}, Lc;->a(Lc;Lf;ZLj;)Led;

    move-result-object v5

    .line 1246
    iget-object v0, p0, Ld;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Ld;->d:Lf;

    iget-object v1, v1, Lf;->d:Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1247
    iget-object v0, p0, Ld;->c:Ljava/util/ArrayList;

    invoke-virtual {v5}, Led;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1248
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    iget-object v1, p0, Ld;->c:Ljava/util/ArrayList;

    invoke-static {v0, v1}, La;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 1251
    iget-object v0, p0, Ld;->h:Lc;

    iget-object v1, p0, Ld;->d:Lf;

    invoke-static {v0, v5, v1}, Lc;->a(Lc;Led;Lf;)V

    .line 1253
    iget-object v0, p0, Ld;->h:Lc;

    iget-object v1, p0, Ld;->d:Lf;

    iget-object v2, p0, Ld;->f:Lj;

    iget-object v3, p0, Ld;->g:Lj;

    iget-boolean v4, p0, Ld;->e:Z

    invoke-static/range {v0 .. v5}, Lc;->a(Lc;Lf;Lj;Lj;ZLed;)V

    .line 1257
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
