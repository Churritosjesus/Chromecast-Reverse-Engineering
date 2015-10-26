.class public final Ldct;
.super Lddr;
.source "PG"

# interfaces
.implements Ldec;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 604
    invoke-static {}, Ldcs;->c()Ldcs;

    move-result-object v0

    invoke-direct {p0, v0}, Lddr;-><init>(Lddq;)V

    .line 605
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ldct;
    .locals 1

    .prologue
    .line 632
    invoke-virtual {p0}, Ldct;->b()V

    .line 633
    iget-object v0, p0, Ldct;->a:Lddq;

    check-cast v0, Ldcs;

    invoke-static {v0, p1}, Ldcs;->a(Ldcs;Ljava/lang/String;)V

    .line 634
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Ldct;
    .locals 1

    .prologue
    .line 724
    invoke-virtual {p0}, Ldct;->b()V

    .line 725
    iget-object v0, p0, Ldct;->a:Lddq;

    check-cast v0, Ldcs;

    invoke-static {v0, p1}, Ldcs;->b(Ldcs;Ljava/lang/String;)V

    .line 726
    return-object p0
.end method
