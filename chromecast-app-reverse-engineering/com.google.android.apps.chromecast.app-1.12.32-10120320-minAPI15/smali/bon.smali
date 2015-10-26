.class final Lbon;
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
    .line 76
    iput-object p1, p0, Lbon;->a:Lbol;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 79
    iget-object v0, p0, Lbon;->a:Lbol;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lbol;->a(Lbol;Z)V

    .line 80
    return-void
.end method
