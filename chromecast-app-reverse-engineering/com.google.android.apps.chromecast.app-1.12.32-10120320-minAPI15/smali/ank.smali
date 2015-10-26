.class final Lank;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Landroid/content/Intent;

.field private synthetic b:Land;


# direct methods
.method constructor <init>(Land;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 802
    iput-object p1, p0, Lank;->b:Land;

    iput-object p2, p0, Lank;->a:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 805
    iget-object v0, p0, Lank;->b:Land;

    iget-object v1, p0, Lank;->a:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Land;->startActivity(Landroid/content/Intent;)V

    .line 806
    return-void
.end method
