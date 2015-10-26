.class public final Ldak;
.super Ldew;
.source "PG"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:I

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/Integer;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 838
    invoke-direct {p0}, Ldew;-><init>()V

    .line 839
    iput-object v0, p0, Ldak;->d:Ljava/lang/String;

    .line 840
    iput-object v0, p0, Ldak;->a:Ljava/lang/String;

    .line 841
    iput-object v0, p0, Ldak;->e:Ljava/lang/String;

    .line 842
    iput-object v0, p0, Ldak;->b:Ljava/lang/String;

    .line 843
    iput-object v0, p0, Ldak;->f:Ljava/lang/Integer;

    .line 844
    iput-object v0, p0, Ldak;->g:Ljava/lang/String;

    .line 845
    const/high16 v0, -0x80000000

    iput v0, p0, Ldak;->c:I

    .line 846
    const/4 v0, -0x1

    iput v0, p0, Ldak;->t:I

    .line 847
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 3

    .prologue
    .line 878
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 879
    iget-object v1, p0, Ldak;->d:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 880
    const/4 v1, 0x1

    iget-object v2, p0, Ldak;->d:Ljava/lang/String;

    .line 881
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 883
    :cond_0
    iget-object v1, p0, Ldak;->a:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 884
    const/4 v1, 0x2

    iget-object v2, p0, Ldak;->a:Ljava/lang/String;

    .line 885
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 887
    :cond_1
    iget-object v1, p0, Ldak;->e:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 888
    const/4 v1, 0x3

    iget-object v2, p0, Ldak;->e:Ljava/lang/String;

    .line 889
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 891
    :cond_2
    iget-object v1, p0, Ldak;->b:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 892
    const/4 v1, 0x4

    iget-object v2, p0, Ldak;->b:Ljava/lang/String;

    .line 893
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 895
    :cond_3
    iget-object v1, p0, Ldak;->f:Ljava/lang/Integer;

    if-eqz v1, :cond_4

    .line 896
    const/4 v1, 0x5

    iget-object v2, p0, Ldak;->f:Ljava/lang/Integer;

    .line 897
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 899
    :cond_4
    iget-object v1, p0, Ldak;->g:Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 900
    const/4 v1, 0x6

    iget-object v2, p0, Ldak;->g:Ljava/lang/String;

    .line 901
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 903
    :cond_5
    iget v1, p0, Ldak;->c:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_6

    .line 904
    const/4 v1, 0x7

    iget v2, p0, Ldak;->c:I

    .line 905
    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 907
    :cond_6
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 1

    .prologue
    .line 794
    .line 1915
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1916
    sparse-switch v0, :sswitch_data_0

    .line 1920
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1921
    :sswitch_0
    return-object p0

    .line 1926
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldak;->d:Ljava/lang/String;

    goto :goto_0

    .line 1930
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldak;->a:Ljava/lang/String;

    goto :goto_0

    .line 1934
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldak;->e:Ljava/lang/String;

    goto :goto_0

    .line 1938
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldak;->b:Ljava/lang/String;

    goto :goto_0

    .line 2169
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1942
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldak;->f:Ljava/lang/Integer;

    goto :goto_0

    .line 1946
    :sswitch_6
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldak;->g:Ljava/lang/String;

    goto :goto_0

    .line 3169
    :sswitch_7
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1951
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1954
    :pswitch_0
    iput v0, p0, Ldak;->c:I

    goto :goto_0

    .line 1916
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x28 -> :sswitch_5
        0x32 -> :sswitch_6
        0x38 -> :sswitch_7
    .end sparse-switch

    .line 1951
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Ldep;)V
    .locals 2

    .prologue
    .line 852
    iget-object v0, p0, Ldak;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 853
    const/4 v0, 0x1

    iget-object v1, p0, Ldak;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 855
    :cond_0
    iget-object v0, p0, Ldak;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 856
    const/4 v0, 0x2

    iget-object v1, p0, Ldak;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 858
    :cond_1
    iget-object v0, p0, Ldak;->e:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 859
    const/4 v0, 0x3

    iget-object v1, p0, Ldak;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 861
    :cond_2
    iget-object v0, p0, Ldak;->b:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 862
    const/4 v0, 0x4

    iget-object v1, p0, Ldak;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 864
    :cond_3
    iget-object v0, p0, Ldak;->f:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    .line 865
    const/4 v0, 0x5

    iget-object v1, p0, Ldak;->f:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 867
    :cond_4
    iget-object v0, p0, Ldak;->g:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 868
    const/4 v0, 0x6

    iget-object v1, p0, Ldak;->g:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 870
    :cond_5
    iget v0, p0, Ldak;->c:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_6

    .line 871
    const/4 v0, 0x7

    iget v1, p0, Ldak;->c:I

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 873
    :cond_6
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 874
    return-void
.end method
