.class final Laok;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Laop;


# direct methods
.method constructor <init>(Land;Laop;)V
    .locals 0

    .prologue
    .line 486
    iput-object p2, p0, Laok;->a:Laop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 489
    iget-object v0, p0, Laok;->a:Laop;

    if-eqz v0, :cond_0

    .line 490
    iget-object v0, p0, Laok;->a:Laop;

    invoke-interface {v0}, Laop;->b()V

    .line 492
    :cond_0
    return-void
.end method
