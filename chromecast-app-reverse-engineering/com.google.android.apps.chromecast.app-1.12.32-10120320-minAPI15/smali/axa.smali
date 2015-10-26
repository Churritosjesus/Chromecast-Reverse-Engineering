.class final Laxa;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Ldbc;

.field private synthetic b:Lawr;


# direct methods
.method constructor <init>(Lawr;Ldbc;)V
    .locals 0

    .prologue
    .line 467
    iput-object p1, p0, Laxa;->b:Lawr;

    iput-object p2, p0, Laxa;->a:Ldbc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 470
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Laxa;->a:Ldbc;

    iget-object v1, v1, Ldbc;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 471
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 472
    iget-object v1, p0, Laxa;->b:Lawr;

    .line 1612
    iget-object v1, v1, Lj;->y:Lm;

    .line 472
    invoke-virtual {v1, v0}, Lm;->startActivity(Landroid/content/Intent;)V

    .line 473
    return-void
.end method
