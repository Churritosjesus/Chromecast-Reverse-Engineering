.class final Lbcg;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Lbcd;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 162
    iput-object p2, p0, Lbcg;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 3

    .prologue
    .line 165
    iget-object v0, p0, Lbcg;->a:Landroid/content/Context;

    sget v1, Lb;->cf:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 166
    return-void
.end method
