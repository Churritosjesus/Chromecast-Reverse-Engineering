.class final Lbjg;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbje;


# direct methods
.method constructor <init>(Lbje;)V
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lbjg;->a:Lbje;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 52
    iget-object v0, p0, Lbjg;->a:Lbje;

    .line 1012
    iget-object v0, v0, Lbje;->c:Lbdm;

    .line 52
    iget-object v1, p0, Lbjg;->a:Lbje;

    .line 2012
    iget-object v1, v1, Lbje;->d:Lbdn;

    .line 52
    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Lbdm;->a(Lbdn;I)V

    .line 53
    return-void
.end method
