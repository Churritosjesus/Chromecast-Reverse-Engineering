.class final Le;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field private synthetic a:Landroid/view/View;

.field private synthetic b:Lf;

.field private synthetic c:I

.field private synthetic d:Ljava/lang/Object;

.field private synthetic e:Lc;


# direct methods
.method constructor <init>(Lc;Landroid/view/View;Lf;ILjava/lang/Object;)V
    .locals 0

    .prologue
    .line 1362
    iput-object p1, p0, Le;->e:Lc;

    iput-object p2, p0, Le;->a:Landroid/view/View;

    iput-object p3, p0, Le;->b:Lf;

    iput p4, p0, Le;->c:I

    iput-object p5, p0, Le;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 4

    .prologue
    .line 1364
    iget-object v0, p0, Le;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 1365
    iget-object v0, p0, Le;->e:Lc;

    iget-object v1, p0, Le;->b:Lf;

    iget v2, p0, Le;->c:I

    iget-object v3, p0, Le;->d:Ljava/lang/Object;

    invoke-static {v0, v1, v2, v3}, Lc;->a(Lc;Lf;ILjava/lang/Object;)V

    .line 1366
    const/4 v0, 0x1

    return v0
.end method
