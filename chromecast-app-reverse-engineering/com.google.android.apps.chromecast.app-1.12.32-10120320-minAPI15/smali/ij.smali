.class final Lij;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Ljava/lang/ref/WeakReference;

.field private b:Lih;

.field private synthetic c:Lii;


# direct methods
.method constructor <init>(Lii;Lih;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 320
    iput-object p1, p0, Lij;->c:Lii;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 321
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lij;->a:Ljava/lang/ref/WeakReference;

    .line 322
    iput-object p2, p0, Lij;->b:Lih;

    .line 323
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 327
    iget-object v0, p0, Lij;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 328
    if-eqz v0, :cond_0

    .line 329
    iget-object v1, p0, Lij;->c:Lii;

    iget-object v2, p0, Lij;->b:Lih;

    .line 1081
    invoke-virtual {v1, v2, v0}, Lii;->c(Lih;Landroid/view/View;)V

    .line 331
    :cond_0
    return-void
.end method
