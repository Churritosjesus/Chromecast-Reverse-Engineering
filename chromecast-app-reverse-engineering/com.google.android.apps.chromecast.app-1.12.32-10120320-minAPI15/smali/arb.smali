.class final Larb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Laqy;


# direct methods
.method constructor <init>(Laqy;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Larb;->a:Laqy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Larb;->a:Laqy;

    invoke-static {v0}, Laqy;->a(Laqy;)Larc;

    move-result-object v0

    invoke-interface {v0}, Larc;->p()V

    .line 64
    return-void
.end method
