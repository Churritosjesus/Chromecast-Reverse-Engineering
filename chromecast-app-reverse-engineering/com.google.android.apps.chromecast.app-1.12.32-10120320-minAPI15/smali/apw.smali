.class final Lapw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Lapu;


# direct methods
.method constructor <init>(Lapu;)V
    .locals 0

    .prologue
    .line 168
    iput-object p1, p0, Lapw;->a:Lapu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 171
    iget-object v0, p0, Lapw;->a:Lapu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lapu;->a(Lapu;Ljava/lang/String;)V

    .line 172
    return-void
.end method
