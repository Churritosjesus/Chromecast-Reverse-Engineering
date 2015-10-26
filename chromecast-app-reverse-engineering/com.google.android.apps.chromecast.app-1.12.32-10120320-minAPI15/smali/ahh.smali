.class final Lahh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Landroid/content/Context;

.field private synthetic b:Lahk;

.field private synthetic c:Lahm;


# direct methods
.method constructor <init>(Landroid/content/Context;Lahk;Lahm;)V
    .locals 0

    .prologue
    .line 746
    iput-object p1, p0, Lahh;->a:Landroid/content/Context;

    iput-object p2, p0, Lahh;->b:Lahk;

    iput-object p3, p0, Lahh;->c:Lahm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 749
    iget-object v0, p0, Lahh;->a:Landroid/content/Context;

    iget-object v1, p0, Lahh;->b:Lahk;

    invoke-static {v0, v1}, Lahe;->a(Landroid/content/Context;Lahk;)Laht;

    move-result-object v0

    .line 750
    iget-object v1, p0, Lahh;->c:Lahm;

    invoke-virtual {v0, v1}, Laht;->a(Lahm;)V

    .line 751
    invoke-static {}, Lahe;->d()V

    .line 752
    return-void
.end method
