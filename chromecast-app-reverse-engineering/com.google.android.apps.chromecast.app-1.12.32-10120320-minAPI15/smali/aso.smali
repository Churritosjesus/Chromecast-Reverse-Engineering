.class final Laso;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Lash;


# direct methods
.method constructor <init>(Lash;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 636
    iput-object p1, p0, Laso;->b:Lash;

    iput-object p2, p0, Laso;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 639
    iget-object v0, p0, Laso;->b:Lash;

    .line 1612
    iget-object v0, v0, Lj;->y:Lm;

    .line 639
    iget-object v1, p0, Laso;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 640
    return-void
.end method
