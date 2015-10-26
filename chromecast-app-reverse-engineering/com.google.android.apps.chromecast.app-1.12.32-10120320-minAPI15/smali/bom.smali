.class final Lbom;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Lbol;


# direct methods
.method constructor <init>(Lbol;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lbom;->a:Lbol;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 86
    iget-object v0, p0, Lbom;->a:Lbol;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbol;->a(Lbol;Z)V

    .line 87
    return-void
.end method
