package br.ufes.inf.nemo.ontouml.ontoumlprime.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufes.inf.nemo.ontouml.ontoumlprime.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'complete'", "'GeneralizationSet'", "'specializes'", "'into'", "','", "';'", "'specialize'", "'=>'", "'PrimitiveDataType'", "'('", "')'", "'ComplexDataType'", "'enum'", "'essential'", "'inseparable'", "'shareable'", "'immutable'", "'relation'", "'['", "'..'", "']'", "'isComponentOf'", "'isMemberOf'", "'isSubCollectionOf'", "'isSubQuantityOf'", "'Kind'", "'Quantity'", "'extensional'", "'CollectiveUniversal'", "'SubKind'", "'Role'", "'Phase'", "'Category'", "'Mixin'", "'RoleMixin'", "'RelatorUniversal'", "'material'", "'rel'", "'target'", "'formal'", "'ModeUniversal'", "'QualityUniversal'", "'characterizes'", "'datatypes'", "'assoc'", "'PrimitiveDataTypeType'", "'-'", "'characterizedBy'", "'mediates'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;
     	
        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:76:1: ruleModel returns [EObject current=null] : ( () ( (lv_elements_1_0= ruleElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:79:28: ( ( () ( (lv_elements_1_0= ruleElement ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:80:1: ( () ( (lv_elements_1_0= ruleElement ) )* )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:80:1: ( () ( (lv_elements_1_0= ruleElement ) )* )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:80:2: () ( (lv_elements_1_0= ruleElement ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:80:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:86:2: ( (lv_elements_1_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||(LA1_0>=14 && LA1_0<=15)||LA1_0==22||(LA1_0>=25 && LA1_0<=30)||(LA1_0>=39 && LA1_0<=50)||(LA1_0>=53 && LA1_0<=55)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:87:1: (lv_elements_1_0= ruleElement )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:87:1: (lv_elements_1_0= ruleElement )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:88:3: lv_elements_1_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleModel140);
            	    lv_elements_1_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:112:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:113:2: (iv_ruleElement= ruleElement EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:114:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement177);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement187); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:121:1: ruleElement returns [EObject current=null] : (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_GeneralizationSet_1 = null;

        EObject this_PrimitiveDataType_2 = null;

        EObject this_ComplexDataType_3 = null;

        EObject this_Enumeration_4 = null;

        EObject this_MeronymicRelation_5 = null;

        EObject this_Kind_6 = null;

        EObject this_QuantityUniversal_7 = null;

        EObject this_CollectiveUniversal_8 = null;

        EObject this_SubKind_9 = null;

        EObject this_Role_10 = null;

        EObject this_Phase_11 = null;

        EObject this_Category_12 = null;

        EObject this_Mixin_13 = null;

        EObject this_RoleMixin_14 = null;

        EObject this_RelatorUniversal_15 = null;

        EObject this_BinaryMaterialRelation_16 = null;

        EObject this_BinaryFormalRelation_17 = null;

        EObject this_ModeUniversal_18 = null;

        EObject this_QualityUniversal_19 = null;

        EObject this_nAryMaterialRelation_20 = null;

        EObject this_nAryFormalRelation_21 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:124:28: ( (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:125:1: (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:125:1: (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation )
            int alt2=22;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:126:5: this_Package_0= rulePackage
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getPackageParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePackage_in_ruleElement234);
                    this_Package_0=rulePackage();

                    state._fsp--;

                     
                            current = this_Package_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:136:5: this_GeneralizationSet_1= ruleGeneralizationSet
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getGeneralizationSetParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGeneralizationSet_in_ruleElement261);
                    this_GeneralizationSet_1=ruleGeneralizationSet();

                    state._fsp--;

                     
                            current = this_GeneralizationSet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:146:5: this_PrimitiveDataType_2= rulePrimitiveDataType
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getPrimitiveDataTypeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveDataType_in_ruleElement288);
                    this_PrimitiveDataType_2=rulePrimitiveDataType();

                    state._fsp--;

                     
                            current = this_PrimitiveDataType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:156:5: this_ComplexDataType_3= ruleComplexDataType
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getComplexDataTypeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComplexDataType_in_ruleElement315);
                    this_ComplexDataType_3=ruleComplexDataType();

                    state._fsp--;

                     
                            current = this_ComplexDataType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:166:5: this_Enumeration_4= ruleEnumeration
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getEnumerationParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_ruleElement342);
                    this_Enumeration_4=ruleEnumeration();

                    state._fsp--;

                     
                            current = this_Enumeration_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:176:5: this_MeronymicRelation_5= ruleMeronymicRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getMeronymicRelationParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMeronymicRelation_in_ruleElement369);
                    this_MeronymicRelation_5=ruleMeronymicRelation();

                    state._fsp--;

                     
                            current = this_MeronymicRelation_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:186:5: this_Kind_6= ruleKind
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getKindParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKind_in_ruleElement396);
                    this_Kind_6=ruleKind();

                    state._fsp--;

                     
                            current = this_Kind_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:196:5: this_QuantityUniversal_7= ruleQuantityUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getQuantityUniversalParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuantityUniversal_in_ruleElement423);
                    this_QuantityUniversal_7=ruleQuantityUniversal();

                    state._fsp--;

                     
                            current = this_QuantityUniversal_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:206:5: this_CollectiveUniversal_8= ruleCollectiveUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getCollectiveUniversalParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCollectiveUniversal_in_ruleElement450);
                    this_CollectiveUniversal_8=ruleCollectiveUniversal();

                    state._fsp--;

                     
                            current = this_CollectiveUniversal_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:216:5: this_SubKind_9= ruleSubKind
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getSubKindParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubKind_in_ruleElement477);
                    this_SubKind_9=ruleSubKind();

                    state._fsp--;

                     
                            current = this_SubKind_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:226:5: this_Role_10= ruleRole
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getRoleParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleElement504);
                    this_Role_10=ruleRole();

                    state._fsp--;

                     
                            current = this_Role_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:236:5: this_Phase_11= rulePhase
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getPhaseParserRuleCall_11()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePhase_in_ruleElement531);
                    this_Phase_11=rulePhase();

                    state._fsp--;

                     
                            current = this_Phase_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:246:5: this_Category_12= ruleCategory
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getCategoryParserRuleCall_12()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCategory_in_ruleElement558);
                    this_Category_12=ruleCategory();

                    state._fsp--;

                     
                            current = this_Category_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:256:5: this_Mixin_13= ruleMixin
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getMixinParserRuleCall_13()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMixin_in_ruleElement585);
                    this_Mixin_13=ruleMixin();

                    state._fsp--;

                     
                            current = this_Mixin_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:266:5: this_RoleMixin_14= ruleRoleMixin
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getRoleMixinParserRuleCall_14()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRoleMixin_in_ruleElement612);
                    this_RoleMixin_14=ruleRoleMixin();

                    state._fsp--;

                     
                            current = this_RoleMixin_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:276:5: this_RelatorUniversal_15= ruleRelatorUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getRelatorUniversalParserRuleCall_15()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRelatorUniversal_in_ruleElement639);
                    this_RelatorUniversal_15=ruleRelatorUniversal();

                    state._fsp--;

                     
                            current = this_RelatorUniversal_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:286:5: this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getBinaryMaterialRelationParserRuleCall_16()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryMaterialRelation_in_ruleElement666);
                    this_BinaryMaterialRelation_16=ruleBinaryMaterialRelation();

                    state._fsp--;

                     
                            current = this_BinaryMaterialRelation_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:296:5: this_BinaryFormalRelation_17= ruleBinaryFormalRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getBinaryFormalRelationParserRuleCall_17()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryFormalRelation_in_ruleElement693);
                    this_BinaryFormalRelation_17=ruleBinaryFormalRelation();

                    state._fsp--;

                     
                            current = this_BinaryFormalRelation_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:306:5: this_ModeUniversal_18= ruleModeUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getModeUniversalParserRuleCall_18()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleModeUniversal_in_ruleElement720);
                    this_ModeUniversal_18=ruleModeUniversal();

                    state._fsp--;

                     
                            current = this_ModeUniversal_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:316:5: this_QualityUniversal_19= ruleQualityUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getQualityUniversalParserRuleCall_19()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQualityUniversal_in_ruleElement747);
                    this_QualityUniversal_19=ruleQualityUniversal();

                    state._fsp--;

                     
                            current = this_QualityUniversal_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:326:5: this_nAryMaterialRelation_20= rulenAryMaterialRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getNAryMaterialRelationParserRuleCall_20()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulenAryMaterialRelation_in_ruleElement774);
                    this_nAryMaterialRelation_20=rulenAryMaterialRelation();

                    state._fsp--;

                     
                            current = this_nAryMaterialRelation_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:336:5: this_nAryFormalRelation_21= rulenAryFormalRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getNAryFormalRelationParserRuleCall_21()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulenAryFormalRelation_in_ruleElement801);
                    this_nAryFormalRelation_21=rulenAryFormalRelation();

                    state._fsp--;

                     
                            current = this_nAryFormalRelation_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRulePackage"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:360:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:361:2: (iv_rulePackage= rulePackage EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:362:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_entryRulePackage844);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage854); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:369:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:372:28: ( ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:373:1: ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:373:1: ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:373:2: () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:373:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:374:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPackageAccess().getPackageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePackage900); 

                	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:383:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:384:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:384:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:385:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePackage917); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePackage934); 

                	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:405:1: ( (lv_elements_4_0= ruleElement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==11||(LA3_0>=14 && LA3_0<=15)||LA3_0==22||(LA3_0>=25 && LA3_0<=30)||(LA3_0>=39 && LA3_0<=50)||(LA3_0>=53 && LA3_0<=55)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:406:1: (lv_elements_4_0= ruleElement )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:406:1: (lv_elements_4_0= ruleElement )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:407:3: lv_elements_4_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getElementsElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_rulePackage955);
            	    lv_elements_4_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePackage968); 

                	newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleGeneralizationSet"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:435:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:436:2: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:437:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGeneralizationSet_in_entryRuleGeneralizationSet1004);
            iv_ruleGeneralizationSet=ruleGeneralizationSet();

            state._fsp--;

             current =iv_ruleGeneralizationSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGeneralizationSet1014); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralizationSet"


    // $ANTLR start "ruleGeneralizationSet"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:444:1: ruleGeneralizationSet returns [EObject current=null] : (this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet | this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject this_CompleteGeneralizationSet_0 = null;

        EObject this_AnonymousGeneralizationSet_1 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:447:28: ( (this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet | this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:448:1: (this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet | this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:448:1: (this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet | this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:449:5: this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet
                    {
                     
                            newCompositeNode(grammarAccess.getGeneralizationSetAccess().getCompleteGeneralizationSetParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCompleteGeneralizationSet_in_ruleGeneralizationSet1061);
                    this_CompleteGeneralizationSet_0=ruleCompleteGeneralizationSet();

                    state._fsp--;

                     
                            current = this_CompleteGeneralizationSet_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:459:5: this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet
                    {
                     
                            newCompositeNode(grammarAccess.getGeneralizationSetAccess().getAnonymousGeneralizationSetParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnonymousGeneralizationSet_in_ruleGeneralizationSet1088);
                    this_AnonymousGeneralizationSet_1=ruleAnonymousGeneralizationSet();

                    state._fsp--;

                     
                            current = this_AnonymousGeneralizationSet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "entryRuleCompleteGeneralizationSet"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:475:1: entryRuleCompleteGeneralizationSet returns [EObject current=null] : iv_ruleCompleteGeneralizationSet= ruleCompleteGeneralizationSet EOF ;
    public final EObject entryRuleCompleteGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleteGeneralizationSet = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:476:2: (iv_ruleCompleteGeneralizationSet= ruleCompleteGeneralizationSet EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:477:2: iv_ruleCompleteGeneralizationSet= ruleCompleteGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getCompleteGeneralizationSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompleteGeneralizationSet_in_entryRuleCompleteGeneralizationSet1123);
            iv_ruleCompleteGeneralizationSet=ruleCompleteGeneralizationSet();

            state._fsp--;

             current =iv_ruleCompleteGeneralizationSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompleteGeneralizationSet1133); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompleteGeneralizationSet"


    // $ANTLR start "ruleCompleteGeneralizationSet"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:484:1: ruleCompleteGeneralizationSet returns [EObject current=null] : ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) ;
    public final EObject ruleCompleteGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token lv_isCovering_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:487:28: ( ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:488:1: ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:488:1: ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:488:2: ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:488:2: ( (lv_isCovering_0_0= 'complete' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:489:1: (lv_isCovering_0_0= 'complete' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:489:1: (lv_isCovering_0_0= 'complete' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:490:3: lv_isCovering_0_0= 'complete'
                    {
                    lv_isCovering_0_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCompleteGeneralizationSet1176); 

                            newLeafNode(lv_isCovering_0_0, grammarAccess.getCompleteGeneralizationSetAccess().getIsCoveringCompleteKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
                    	        }
                           		setWithLastConsumed(current, "isCovering", true, "complete");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCompleteGeneralizationSet1202); 

                	newLeafNode(otherlv_1, grammarAccess.getCompleteGeneralizationSetAccess().getGeneralizationSetKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:507:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:508:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:508:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:509:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1219); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCompleteGeneralizationSetAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCompleteGeneralizationSet1236); 

                	newLeafNode(otherlv_3, grammarAccess.getCompleteGeneralizationSetAccess().getSpecializesKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:529:1: ( (otherlv_4= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:530:1: (otherlv_4= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:530:1: (otherlv_4= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:531:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1256); 

            		newLeafNode(otherlv_4, grammarAccess.getCompleteGeneralizationSetAccess().getSpecializedUniversalUniversalCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCompleteGeneralizationSet1268); 

                	newLeafNode(otherlv_5, grammarAccess.getCompleteGeneralizationSetAccess().getIntoKeyword_5());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:546:1: ( (otherlv_6= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:547:1: (otherlv_6= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:547:1: (otherlv_6= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:548:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1288); 

            		newLeafNode(otherlv_6, grammarAccess.getCompleteGeneralizationSetAccess().getSpecializingUniversalsUniversalCrossReference_6_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:559:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:559:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCompleteGeneralizationSet1301); 

            	        	newLeafNode(otherlv_7, grammarAccess.getCompleteGeneralizationSetAccess().getCommaKeyword_7_0());
            	        
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:563:1: ( (otherlv_8= RULE_ID ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:564:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:564:1: (otherlv_8= RULE_ID )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:565:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1321); 

            	    		newLeafNode(otherlv_8, grammarAccess.getCompleteGeneralizationSetAccess().getSpecializingUniversalsUniversalCrossReference_7_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCompleteGeneralizationSet1335); 

                	newLeafNode(otherlv_9, grammarAccess.getCompleteGeneralizationSetAccess().getSemicolonKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompleteGeneralizationSet"


    // $ANTLR start "entryRuleAnonymousGeneralizationSet"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:588:1: entryRuleAnonymousGeneralizationSet returns [EObject current=null] : iv_ruleAnonymousGeneralizationSet= ruleAnonymousGeneralizationSet EOF ;
    public final EObject entryRuleAnonymousGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousGeneralizationSet = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:589:2: (iv_ruleAnonymousGeneralizationSet= ruleAnonymousGeneralizationSet EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:590:2: iv_ruleAnonymousGeneralizationSet= ruleAnonymousGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getAnonymousGeneralizationSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnonymousGeneralizationSet_in_entryRuleAnonymousGeneralizationSet1371);
            iv_ruleAnonymousGeneralizationSet=ruleAnonymousGeneralizationSet();

            state._fsp--;

             current =iv_ruleAnonymousGeneralizationSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnonymousGeneralizationSet1381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnonymousGeneralizationSet"


    // $ANTLR start "ruleAnonymousGeneralizationSet"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:597:1: ruleAnonymousGeneralizationSet returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) ;
    public final EObject ruleAnonymousGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:600:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:601:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:601:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:601:2: ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:601:2: ( (otherlv_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:602:1: (otherlv_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:602:1: (otherlv_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:603:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnonymousGeneralizationSetRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnonymousGeneralizationSet1426); 

            		newLeafNode(otherlv_0, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializingUniversalsUniversalCrossReference_0_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:614:2: ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==16||LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:614:3: ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:614:3: ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:614:4: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:614:4: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:614:6: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
                    	    {
                    	    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnonymousGeneralizationSet1441); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getAnonymousGeneralizationSetAccess().getCommaKeyword_1_0_0_0());
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:618:1: ( (otherlv_2= RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:619:1: (otherlv_2= RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:619:1: (otherlv_2= RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:620:3: otherlv_2= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAnonymousGeneralizationSetRule());
                    	    	        }
                    	            
                    	    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnonymousGeneralizationSet1461); 

                    	    		newLeafNode(otherlv_2, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializingUniversalsUniversalCrossReference_1_0_0_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:631:4: (otherlv_3= 'specialize' | otherlv_4= '=>' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==20) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==21) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:631:6: otherlv_3= 'specialize'
                            {
                            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnonymousGeneralizationSet1476); 

                                	newLeafNode(otherlv_3, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializeKeyword_1_0_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:636:7: otherlv_4= '=>'
                            {
                            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnonymousGeneralizationSet1494); 

                                	newLeafNode(otherlv_4, grammarAccess.getAnonymousGeneralizationSetAccess().getEqualsSignGreaterThanSignKeyword_1_0_1_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:641:6: (otherlv_5= 'specializes' | otherlv_6= '=>' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:641:6: (otherlv_5= 'specializes' | otherlv_6= '=>' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==16) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==21) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:641:8: otherlv_5= 'specializes'
                            {
                            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnonymousGeneralizationSet1515); 

                                	newLeafNode(otherlv_5, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializesKeyword_1_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:646:7: otherlv_6= '=>'
                            {
                            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnonymousGeneralizationSet1533); 

                                	newLeafNode(otherlv_6, grammarAccess.getAnonymousGeneralizationSetAccess().getEqualsSignGreaterThanSignKeyword_1_1_1());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:650:3: ( (otherlv_7= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:651:1: (otherlv_7= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:651:1: (otherlv_7= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:652:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnonymousGeneralizationSetRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnonymousGeneralizationSet1555); 

            		newLeafNode(otherlv_7, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializedUniversalUniversalCrossReference_2_0()); 
            	

            }


            }

            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnonymousGeneralizationSet1567); 

                	newLeafNode(otherlv_8, grammarAccess.getAnonymousGeneralizationSetAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnonymousGeneralizationSet"


    // $ANTLR start "entryRulePrimitiveDataType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:679:1: entryRulePrimitiveDataType returns [EObject current=null] : iv_rulePrimitiveDataType= rulePrimitiveDataType EOF ;
    public final EObject entryRulePrimitiveDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDataType = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:680:2: (iv_rulePrimitiveDataType= rulePrimitiveDataType EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:681:2: iv_rulePrimitiveDataType= rulePrimitiveDataType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveDataType_in_entryRulePrimitiveDataType1607);
            iv_rulePrimitiveDataType=rulePrimitiveDataType();

            state._fsp--;

             current =iv_rulePrimitiveDataType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveDataType1617); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveDataType"


    // $ANTLR start "rulePrimitiveDataType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:688:1: rulePrimitiveDataType returns [EObject current=null] : (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' ) ;
    public final EObject rulePrimitiveDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv__type_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:691:28: ( (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:692:1: (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:692:1: (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:692:3: otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePrimitiveDataType1654); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveDataTypeAccess().getPrimitiveDataTypeKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:696:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:697:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:697:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:698:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePrimitiveDataType1671); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimitiveDataType1688); 

                	newLeafNode(otherlv_2, grammarAccess.getPrimitiveDataTypeAccess().getLeftParenthesisKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:718:1: ( (lv__type_3_0= rulePrimitiveDataTypeType ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:719:1: (lv__type_3_0= rulePrimitiveDataTypeType )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:719:1: (lv__type_3_0= rulePrimitiveDataTypeType )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:720:3: lv__type_3_0= rulePrimitiveDataTypeType
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveDataTypeAccess().get_typePrimitiveDataTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveDataTypeType_in_rulePrimitiveDataType1709);
            lv__type_3_0=rulePrimitiveDataTypeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrimitiveDataTypeRule());
            	        }
                   		set(
                   			current, 
                   			"_type",
                    		lv__type_3_0, 
                    		"PrimitiveDataTypeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePrimitiveDataType1721); 

                	newLeafNode(otherlv_4, grammarAccess.getPrimitiveDataTypeAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePrimitiveDataType1733); 

                	newLeafNode(otherlv_5, grammarAccess.getPrimitiveDataTypeAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveDataType"


    // $ANTLR start "entryRuleComplexDataType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:752:1: entryRuleComplexDataType returns [EObject current=null] : iv_ruleComplexDataType= ruleComplexDataType EOF ;
    public final EObject entryRuleComplexDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexDataType = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:753:2: (iv_ruleComplexDataType= ruleComplexDataType EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:754:2: iv_ruleComplexDataType= ruleComplexDataType EOF
            {
             newCompositeNode(grammarAccess.getComplexDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComplexDataType_in_entryRuleComplexDataType1769);
            iv_ruleComplexDataType=ruleComplexDataType();

            state._fsp--;

             current =iv_ruleComplexDataType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComplexDataType1779); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexDataType"


    // $ANTLR start "ruleComplexDataType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:761:1: ruleComplexDataType returns [EObject current=null] : (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleComplexDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:764:28: ( (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:765:1: (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:765:1: (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:765:3: otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleComplexDataType1816); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexDataTypeAccess().getComplexDataTypeKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:769:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:770:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:770:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:771:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComplexDataType1833); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComplexDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComplexDataType1850); 

                	newLeafNode(otherlv_2, grammarAccess.getComplexDataTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:791:1: ( (lv_attributes_3_0= ruleDataTypeAttribute ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:792:1: (lv_attributes_3_0= ruleDataTypeAttribute )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:792:1: (lv_attributes_3_0= ruleDataTypeAttribute )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:793:3: lv_attributes_3_0= ruleDataTypeAttribute
            {
             
            	        newCompositeNode(grammarAccess.getComplexDataTypeAccess().getAttributesDataTypeAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDataTypeAttribute_in_ruleComplexDataType1871);
            lv_attributes_3_0=ruleDataTypeAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComplexDataTypeRule());
            	        }
                   		add(
                   			current, 
                   			"attributes",
                    		lv_attributes_3_0, 
                    		"DataTypeAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:809:2: (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:809:4: otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleComplexDataType1884); 

            	        	newLeafNode(otherlv_4, grammarAccess.getComplexDataTypeAccess().getSemicolonKeyword_4_0());
            	        
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:813:1: ( (lv_attributes_5_0= ruleDataTypeAttribute ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:814:1: (lv_attributes_5_0= ruleDataTypeAttribute )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:814:1: (lv_attributes_5_0= ruleDataTypeAttribute )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:815:3: lv_attributes_5_0= ruleDataTypeAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexDataTypeAccess().getAttributesDataTypeAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDataTypeAttribute_in_ruleComplexDataType1905);
            	    lv_attributes_5_0=ruleDataTypeAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComplexDataTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_5_0, 
            	            		"DataTypeAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleComplexDataType1919); 

                	newLeafNode(otherlv_6, grammarAccess.getComplexDataTypeAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexDataType"


    // $ANTLR start "entryRuleEnumeration"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:843:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:844:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:845:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_entryRuleEnumeration1955);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumeration1965); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:852:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_enumerationLiterals_3_0 = null;

        AntlrDatatypeRuleToken lv_enumerationLiterals_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:855:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:856:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:856:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:856:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEnumeration2002); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:860:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:861:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:861:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:862:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumeration2019); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEnumeration2036); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:882:1: ( (lv_enumerationLiterals_3_0= ruleEString ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:883:1: (lv_enumerationLiterals_3_0= ruleEString )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:883:1: (lv_enumerationLiterals_3_0= ruleEString )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:884:3: lv_enumerationLiterals_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumeration2057);
            lv_enumerationLiterals_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	        }
                   		add(
                   			current, 
                   			"enumerationLiterals",
                    		lv_enumerationLiterals_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:900:2: (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:900:4: otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEnumeration2070); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getCommaKeyword_4_0());
            	        
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:904:1: ( (lv_enumerationLiterals_5_0= ruleEString ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:905:1: (lv_enumerationLiterals_5_0= ruleEString )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:905:1: (lv_enumerationLiterals_5_0= ruleEString )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:906:3: lv_enumerationLiterals_5_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEStringParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumeration2091);
            	    lv_enumerationLiterals_5_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"enumerationLiterals",
            	            		lv_enumerationLiterals_5_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEnumeration2105); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleMeronymicRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:934:1: entryRuleMeronymicRelation returns [EObject current=null] : iv_ruleMeronymicRelation= ruleMeronymicRelation EOF ;
    public final EObject entryRuleMeronymicRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeronymicRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:935:2: (iv_ruleMeronymicRelation= ruleMeronymicRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:936:2: iv_ruleMeronymicRelation= ruleMeronymicRelation EOF
            {
             newCompositeNode(grammarAccess.getMeronymicRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMeronymicRelation_in_entryRuleMeronymicRelation2141);
            iv_ruleMeronymicRelation=ruleMeronymicRelation();

            state._fsp--;

             current =iv_ruleMeronymicRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMeronymicRelation2151); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeronymicRelation"


    // $ANTLR start "ruleMeronymicRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:943:1: ruleMeronymicRelation returns [EObject current=null] : (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation ) ;
    public final EObject ruleMeronymicRelation() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentOfRelation_0 = null;

        EObject this_MembershipRelation_1 = null;

        EObject this_SubCollectionRelation_2 = null;

        EObject this_SubQuantityRelation_3 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:946:28: ( (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:947:1: (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:947:1: (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:948:5: this_ComponentOfRelation_0= ruleComponentOfRelation
                    {
                     
                            newCompositeNode(grammarAccess.getMeronymicRelationAccess().getComponentOfRelationParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComponentOfRelation_in_ruleMeronymicRelation2198);
                    this_ComponentOfRelation_0=ruleComponentOfRelation();

                    state._fsp--;

                     
                            current = this_ComponentOfRelation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:958:5: this_MembershipRelation_1= ruleMembershipRelation
                    {
                     
                            newCompositeNode(grammarAccess.getMeronymicRelationAccess().getMembershipRelationParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMembershipRelation_in_ruleMeronymicRelation2225);
                    this_MembershipRelation_1=ruleMembershipRelation();

                    state._fsp--;

                     
                            current = this_MembershipRelation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:968:5: this_SubCollectionRelation_2= ruleSubCollectionRelation
                    {
                     
                            newCompositeNode(grammarAccess.getMeronymicRelationAccess().getSubCollectionRelationParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubCollectionRelation_in_ruleMeronymicRelation2252);
                    this_SubCollectionRelation_2=ruleSubCollectionRelation();

                    state._fsp--;

                     
                            current = this_SubCollectionRelation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:978:5: this_SubQuantityRelation_3= ruleSubQuantityRelation
                    {
                     
                            newCompositeNode(grammarAccess.getMeronymicRelationAccess().getSubQuantityRelationParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubQuantityRelation_in_ruleMeronymicRelation2279);
                    this_SubQuantityRelation_3=ruleSubQuantityRelation();

                    state._fsp--;

                     
                            current = this_SubQuantityRelation_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeronymicRelation"


    // $ANTLR start "entryRuleComponentOfRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:994:1: entryRuleComponentOfRelation returns [EObject current=null] : iv_ruleComponentOfRelation= ruleComponentOfRelation EOF ;
    public final EObject entryRuleComponentOfRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentOfRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:995:2: (iv_ruleComponentOfRelation= ruleComponentOfRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:996:2: iv_ruleComponentOfRelation= ruleComponentOfRelation EOF
            {
             newCompositeNode(grammarAccess.getComponentOfRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponentOfRelation_in_entryRuleComponentOfRelation2314);
            iv_ruleComponentOfRelation=ruleComponentOfRelation();

            state._fsp--;

             current =iv_ruleComponentOfRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentOfRelation2324); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentOfRelation"


    // $ANTLR start "ruleComponentOfRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1003:1: ruleComponentOfRelation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) ;
    public final EObject ruleComponentOfRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_1_0=null;
        Token lv_partIsInseparable_2_0=null;
        Token lv_partIsShareable_3_0=null;
        Token lv_partIsImmutable_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_8_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_10_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_15_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_17_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1006:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1007:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1007:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1007:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1007:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1009:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1009:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1010:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1013:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1014:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1014:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=5;
                int LA14_0 = input.LA(1);

                if ( LA14_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 2) ) {
                    alt14=3;
                }
                else if ( LA14_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 3) ) {
                    alt14=4;
                }


                switch (alt14) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1016:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1016:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1017:5: {...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1017:116: ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1018:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1021:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1021:7: {...}? => ( (lv_partIsEssential_1_0= 'essential' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1021:16: ( (lv_partIsEssential_1_0= 'essential' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1022:1: (lv_partIsEssential_1_0= 'essential' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1022:1: (lv_partIsEssential_1_0= 'essential' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1023:3: lv_partIsEssential_1_0= 'essential'
            	    {
            	    lv_partIsEssential_1_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleComponentOfRelation2412); 

            	            newLeafNode(lv_partIsEssential_1_0, grammarAccess.getComponentOfRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsEssential", true, "essential");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1043:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1043:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1044:5: {...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1044:116: ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1045:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1048:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1048:7: {...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1048:16: ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1049:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1049:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1050:3: lv_partIsInseparable_2_0= 'inseparable'
            	    {
            	    lv_partIsInseparable_2_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleComponentOfRelation2497); 

            	            newLeafNode(lv_partIsInseparable_2_0, grammarAccess.getComponentOfRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1070:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1070:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1071:5: {...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1071:116: ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1072:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1075:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1075:7: {...}? => ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1075:16: ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1076:1: (lv_partIsShareable_3_0= 'shareable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1076:1: (lv_partIsShareable_3_0= 'shareable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1077:3: lv_partIsShareable_3_0= 'shareable'
            	    {
            	    lv_partIsShareable_3_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleComponentOfRelation2582); 

            	            newLeafNode(lv_partIsShareable_3_0, grammarAccess.getComponentOfRelationAccess().getPartIsShareableShareableKeyword_0_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsShareable", true, "shareable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1097:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1097:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1098:5: {...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1098:116: ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1099:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 3);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1102:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1102:7: {...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1102:16: ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1103:1: (lv_partIsImmutable_4_0= 'immutable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1103:1: (lv_partIsImmutable_4_0= 'immutable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1104:3: lv_partIsImmutable_4_0= 'immutable'
            	    {
            	    lv_partIsImmutable_4_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleComponentOfRelation2667); 

            	            newLeafNode(lv_partIsImmutable_4_0, grammarAccess.getComponentOfRelationAccess().getPartIsImmutableImmutableKeyword_0_3_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsImmutable", true, "immutable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canLeave(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	

            }

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleComponentOfRelation2738); 

                	newLeafNode(otherlv_5, grammarAccess.getComponentOfRelationAccess().getRelationKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1136:1: ( (otherlv_6= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1137:1: (otherlv_6= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1137:1: (otherlv_6= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1138:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComponentOfRelation2758); 

            		newLeafNode(otherlv_6, grammarAccess.getComponentOfRelationAccess().getPartSubstantialUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1149:2: (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1149:4: otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleComponentOfRelation2771); 

                        	newLeafNode(otherlv_7, grammarAccess.getComponentOfRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1153:1: ( (lv_sourceLowerBound_8_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1154:1: (lv_sourceLowerBound_8_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1154:1: (lv_sourceLowerBound_8_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1155:3: lv_sourceLowerBound_8_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOfRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleComponentOfRelation2792);
                    lv_sourceLowerBound_8_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_8_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleComponentOfRelation2804); 

                        	newLeafNode(otherlv_9, grammarAccess.getComponentOfRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1175:1: ( (lv_sourceUpperBound_10_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1176:1: (lv_sourceUpperBound_10_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1176:1: (lv_sourceUpperBound_10_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1177:3: lv_sourceUpperBound_10_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOfRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleComponentOfRelation2825);
                    lv_sourceUpperBound_10_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_10_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleComponentOfRelation2837); 

                        	newLeafNode(otherlv_11, grammarAccess.getComponentOfRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleComponentOfRelation2851); 

                	newLeafNode(otherlv_12, grammarAccess.getComponentOfRelationAccess().getIsComponentOfKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1201:1: ( (otherlv_13= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1202:1: (otherlv_13= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1202:1: (otherlv_13= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1203:3: otherlv_13= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	        }
                    
            otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComponentOfRelation2871); 

            		newLeafNode(otherlv_13, grammarAccess.getComponentOfRelationAccess().getWholeSubstantialUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1214:2: (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1214:4: otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']'
                    {
                    otherlv_14=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleComponentOfRelation2884); 

                        	newLeafNode(otherlv_14, grammarAccess.getComponentOfRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1218:1: ( (lv_targetLowerBound_15_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1219:1: (lv_targetLowerBound_15_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1219:1: (lv_targetLowerBound_15_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1220:3: lv_targetLowerBound_15_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOfRelationAccess().getTargetLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleComponentOfRelation2905);
                    lv_targetLowerBound_15_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_15_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleComponentOfRelation2917); 

                        	newLeafNode(otherlv_16, grammarAccess.getComponentOfRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1240:1: ( (lv_targetUpperBound_17_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1241:1: (lv_targetUpperBound_17_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1241:1: (lv_targetUpperBound_17_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1242:3: lv_targetUpperBound_17_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOfRelationAccess().getTargetUpperBoundEIntParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleComponentOfRelation2938);
                    lv_targetUpperBound_17_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_17_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleComponentOfRelation2950); 

                        	newLeafNode(otherlv_18, grammarAccess.getComponentOfRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleComponentOfRelation2964); 

                	newLeafNode(otherlv_19, grammarAccess.getComponentOfRelationAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentOfRelation"


    // $ANTLR start "entryRuleMembershipRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1274:1: entryRuleMembershipRelation returns [EObject current=null] : iv_ruleMembershipRelation= ruleMembershipRelation EOF ;
    public final EObject entryRuleMembershipRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembershipRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1275:2: (iv_ruleMembershipRelation= ruleMembershipRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1276:2: iv_ruleMembershipRelation= ruleMembershipRelation EOF
            {
             newCompositeNode(grammarAccess.getMembershipRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMembershipRelation_in_entryRuleMembershipRelation3000);
            iv_ruleMembershipRelation=ruleMembershipRelation();

            state._fsp--;

             current =iv_ruleMembershipRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMembershipRelation3010); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMembershipRelation"


    // $ANTLR start "ruleMembershipRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1283:1: ruleMembershipRelation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) ;
    public final EObject ruleMembershipRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_1_0=null;
        Token lv_partIsInseparable_2_0=null;
        Token lv_partIsShareable_3_0=null;
        Token lv_partIsImmutable_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_8_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_10_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_15_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_17_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1286:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1287:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1287:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1287:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1287:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1289:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1289:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1290:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1293:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1294:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1294:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=5;
                int LA17_0 = input.LA(1);

                if ( LA17_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 2) ) {
                    alt17=3;
                }
                else if ( LA17_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 3) ) {
                    alt17=4;
                }


                switch (alt17) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1296:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1296:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1297:5: {...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1297:115: ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1298:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1301:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1301:7: {...}? => ( (lv_partIsEssential_1_0= 'essential' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1301:16: ( (lv_partIsEssential_1_0= 'essential' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1302:1: (lv_partIsEssential_1_0= 'essential' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1302:1: (lv_partIsEssential_1_0= 'essential' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1303:3: lv_partIsEssential_1_0= 'essential'
            	    {
            	    lv_partIsEssential_1_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMembershipRelation3098); 

            	            newLeafNode(lv_partIsEssential_1_0, grammarAccess.getMembershipRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMembershipRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsEssential", true, "essential");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1323:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1323:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1324:5: {...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1324:115: ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1325:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1328:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1328:7: {...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1328:16: ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1329:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1329:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1330:3: lv_partIsInseparable_2_0= 'inseparable'
            	    {
            	    lv_partIsInseparable_2_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMembershipRelation3183); 

            	            newLeafNode(lv_partIsInseparable_2_0, grammarAccess.getMembershipRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMembershipRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1350:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1350:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1351:5: {...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1351:115: ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1352:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1355:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1355:7: {...}? => ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1355:16: ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1356:1: (lv_partIsShareable_3_0= 'shareable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1356:1: (lv_partIsShareable_3_0= 'shareable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1357:3: lv_partIsShareable_3_0= 'shareable'
            	    {
            	    lv_partIsShareable_3_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMembershipRelation3268); 

            	            newLeafNode(lv_partIsShareable_3_0, grammarAccess.getMembershipRelationAccess().getPartIsShareableShareableKeyword_0_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMembershipRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsShareable", true, "shareable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1377:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1377:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1378:5: {...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1378:115: ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1379:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 3);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1382:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1382:7: {...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1382:16: ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1383:1: (lv_partIsImmutable_4_0= 'immutable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1383:1: (lv_partIsImmutable_4_0= 'immutable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1384:3: lv_partIsImmutable_4_0= 'immutable'
            	    {
            	    lv_partIsImmutable_4_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMembershipRelation3353); 

            	            newLeafNode(lv_partIsImmutable_4_0, grammarAccess.getMembershipRelationAccess().getPartIsImmutableImmutableKeyword_0_3_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMembershipRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsImmutable", true, "immutable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canLeave(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	

            }

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMembershipRelation3424); 

                	newLeafNode(otherlv_5, grammarAccess.getMembershipRelationAccess().getRelationKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1416:1: ( (otherlv_6= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1417:1: (otherlv_6= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1417:1: (otherlv_6= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1418:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMembershipRelationRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMembershipRelation3444); 

            		newLeafNode(otherlv_6, grammarAccess.getMembershipRelationAccess().getPartSubstantialUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1429:2: (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1429:4: otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMembershipRelation3457); 

                        	newLeafNode(otherlv_7, grammarAccess.getMembershipRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1433:1: ( (lv_sourceLowerBound_8_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1434:1: (lv_sourceLowerBound_8_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1434:1: (lv_sourceLowerBound_8_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1435:3: lv_sourceLowerBound_8_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMembershipRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMembershipRelation3478);
                    lv_sourceLowerBound_8_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_8_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMembershipRelation3490); 

                        	newLeafNode(otherlv_9, grammarAccess.getMembershipRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1455:1: ( (lv_sourceUpperBound_10_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1456:1: (lv_sourceUpperBound_10_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1456:1: (lv_sourceUpperBound_10_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1457:3: lv_sourceUpperBound_10_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMembershipRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMembershipRelation3511);
                    lv_sourceUpperBound_10_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_10_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMembershipRelation3523); 

                        	newLeafNode(otherlv_11, grammarAccess.getMembershipRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMembershipRelation3537); 

                	newLeafNode(otherlv_12, grammarAccess.getMembershipRelationAccess().getIsMemberOfKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1481:1: ( (otherlv_13= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1482:1: (otherlv_13= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1482:1: (otherlv_13= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1483:3: otherlv_13= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMembershipRelationRule());
            	        }
                    
            otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMembershipRelation3557); 

            		newLeafNode(otherlv_13, grammarAccess.getMembershipRelationAccess().getWholeSubstantialUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1494:2: (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1494:4: otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']'
                    {
                    otherlv_14=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMembershipRelation3570); 

                        	newLeafNode(otherlv_14, grammarAccess.getMembershipRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1498:1: ( (lv_targetLowerBound_15_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1499:1: (lv_targetLowerBound_15_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1499:1: (lv_targetLowerBound_15_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1500:3: lv_targetLowerBound_15_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMembershipRelationAccess().getTargetLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMembershipRelation3591);
                    lv_targetLowerBound_15_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_15_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMembershipRelation3603); 

                        	newLeafNode(otherlv_16, grammarAccess.getMembershipRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1520:1: ( (lv_targetUpperBound_17_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1521:1: (lv_targetUpperBound_17_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1521:1: (lv_targetUpperBound_17_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1522:3: lv_targetUpperBound_17_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMembershipRelationAccess().getTargetUpperBoundEIntParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMembershipRelation3624);
                    lv_targetUpperBound_17_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_17_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMembershipRelation3636); 

                        	newLeafNode(otherlv_18, grammarAccess.getMembershipRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMembershipRelation3650); 

                	newLeafNode(otherlv_19, grammarAccess.getMembershipRelationAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMembershipRelation"


    // $ANTLR start "entryRuleSubCollectionRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1554:1: entryRuleSubCollectionRelation returns [EObject current=null] : iv_ruleSubCollectionRelation= ruleSubCollectionRelation EOF ;
    public final EObject entryRuleSubCollectionRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubCollectionRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1555:2: (iv_ruleSubCollectionRelation= ruleSubCollectionRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1556:2: iv_ruleSubCollectionRelation= ruleSubCollectionRelation EOF
            {
             newCompositeNode(grammarAccess.getSubCollectionRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubCollectionRelation_in_entryRuleSubCollectionRelation3686);
            iv_ruleSubCollectionRelation=ruleSubCollectionRelation();

            state._fsp--;

             current =iv_ruleSubCollectionRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubCollectionRelation3696); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubCollectionRelation"


    // $ANTLR start "ruleSubCollectionRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1563:1: ruleSubCollectionRelation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) ;
    public final EObject ruleSubCollectionRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_1_0=null;
        Token lv_partIsInseparable_2_0=null;
        Token lv_partIsShareable_3_0=null;
        Token lv_partIsImmutable_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_8_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_10_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_15_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_17_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1566:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1567:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1567:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1567:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1567:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1569:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1569:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1570:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1573:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1574:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1574:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=5;
                int LA20_0 = input.LA(1);

                if ( LA20_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 1) ) {
                    alt20=2;
                }
                else if ( LA20_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 2) ) {
                    alt20=3;
                }
                else if ( LA20_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 3) ) {
                    alt20=4;
                }


                switch (alt20) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1576:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1576:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1577:5: {...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1577:118: ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1578:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1581:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1581:7: {...}? => ( (lv_partIsEssential_1_0= 'essential' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1581:16: ( (lv_partIsEssential_1_0= 'essential' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1582:1: (lv_partIsEssential_1_0= 'essential' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1582:1: (lv_partIsEssential_1_0= 'essential' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1583:3: lv_partIsEssential_1_0= 'essential'
            	    {
            	    lv_partIsEssential_1_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSubCollectionRelation3784); 

            	            newLeafNode(lv_partIsEssential_1_0, grammarAccess.getSubCollectionRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsEssential", true, "essential");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1603:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1603:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1604:5: {...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1604:118: ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1605:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1608:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1608:7: {...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1608:16: ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1609:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1609:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1610:3: lv_partIsInseparable_2_0= 'inseparable'
            	    {
            	    lv_partIsInseparable_2_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSubCollectionRelation3869); 

            	            newLeafNode(lv_partIsInseparable_2_0, grammarAccess.getSubCollectionRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1630:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1630:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1631:5: {...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1631:118: ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1632:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1635:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1635:7: {...}? => ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1635:16: ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1636:1: (lv_partIsShareable_3_0= 'shareable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1636:1: (lv_partIsShareable_3_0= 'shareable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1637:3: lv_partIsShareable_3_0= 'shareable'
            	    {
            	    lv_partIsShareable_3_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSubCollectionRelation3954); 

            	            newLeafNode(lv_partIsShareable_3_0, grammarAccess.getSubCollectionRelationAccess().getPartIsShareableShareableKeyword_0_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsShareable", true, "shareable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1657:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1657:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1658:5: {...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1658:118: ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1659:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 3);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1662:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1662:7: {...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1662:16: ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1663:1: (lv_partIsImmutable_4_0= 'immutable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1663:1: (lv_partIsImmutable_4_0= 'immutable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1664:3: lv_partIsImmutable_4_0= 'immutable'
            	    {
            	    lv_partIsImmutable_4_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSubCollectionRelation4039); 

            	            newLeafNode(lv_partIsImmutable_4_0, grammarAccess.getSubCollectionRelationAccess().getPartIsImmutableImmutableKeyword_0_3_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsImmutable", true, "immutable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canLeave(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	

            }

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSubCollectionRelation4110); 

                	newLeafNode(otherlv_5, grammarAccess.getSubCollectionRelationAccess().getRelationKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1696:1: ( (otherlv_6= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1697:1: (otherlv_6= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1697:1: (otherlv_6= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1698:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubCollectionRelation4130); 

            		newLeafNode(otherlv_6, grammarAccess.getSubCollectionRelationAccess().getPartSubstantialUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1709:2: (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1709:4: otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSubCollectionRelation4143); 

                        	newLeafNode(otherlv_7, grammarAccess.getSubCollectionRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1713:1: ( (lv_sourceLowerBound_8_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1714:1: (lv_sourceLowerBound_8_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1714:1: (lv_sourceLowerBound_8_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1715:3: lv_sourceLowerBound_8_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubCollectionRelation4164);
                    lv_sourceLowerBound_8_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_8_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSubCollectionRelation4176); 

                        	newLeafNode(otherlv_9, grammarAccess.getSubCollectionRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1735:1: ( (lv_sourceUpperBound_10_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1736:1: (lv_sourceUpperBound_10_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1736:1: (lv_sourceUpperBound_10_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1737:3: lv_sourceUpperBound_10_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubCollectionRelation4197);
                    lv_sourceUpperBound_10_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_10_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSubCollectionRelation4209); 

                        	newLeafNode(otherlv_11, grammarAccess.getSubCollectionRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSubCollectionRelation4223); 

                	newLeafNode(otherlv_12, grammarAccess.getSubCollectionRelationAccess().getIsSubCollectionOfKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1761:1: ( (otherlv_13= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1762:1: (otherlv_13= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1762:1: (otherlv_13= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1763:3: otherlv_13= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	        }
                    
            otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubCollectionRelation4243); 

            		newLeafNode(otherlv_13, grammarAccess.getSubCollectionRelationAccess().getWholeSubstantialUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1774:2: (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1774:4: otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']'
                    {
                    otherlv_14=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSubCollectionRelation4256); 

                        	newLeafNode(otherlv_14, grammarAccess.getSubCollectionRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1778:1: ( (lv_targetLowerBound_15_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1779:1: (lv_targetLowerBound_15_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1779:1: (lv_targetLowerBound_15_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1780:3: lv_targetLowerBound_15_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getTargetLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubCollectionRelation4277);
                    lv_targetLowerBound_15_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_15_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSubCollectionRelation4289); 

                        	newLeafNode(otherlv_16, grammarAccess.getSubCollectionRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1800:1: ( (lv_targetUpperBound_17_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1801:1: (lv_targetUpperBound_17_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1801:1: (lv_targetUpperBound_17_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1802:3: lv_targetUpperBound_17_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getTargetUpperBoundEIntParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubCollectionRelation4310);
                    lv_targetUpperBound_17_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_17_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSubCollectionRelation4322); 

                        	newLeafNode(otherlv_18, grammarAccess.getSubCollectionRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSubCollectionRelation4336); 

                	newLeafNode(otherlv_19, grammarAccess.getSubCollectionRelationAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubCollectionRelation"


    // $ANTLR start "entryRuleSubQuantityRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1834:1: entryRuleSubQuantityRelation returns [EObject current=null] : iv_ruleSubQuantityRelation= ruleSubQuantityRelation EOF ;
    public final EObject entryRuleSubQuantityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubQuantityRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1835:2: (iv_ruleSubQuantityRelation= ruleSubQuantityRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1836:2: iv_ruleSubQuantityRelation= ruleSubQuantityRelation EOF
            {
             newCompositeNode(grammarAccess.getSubQuantityRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubQuantityRelation_in_entryRuleSubQuantityRelation4372);
            iv_ruleSubQuantityRelation=ruleSubQuantityRelation();

            state._fsp--;

             current =iv_ruleSubQuantityRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubQuantityRelation4382); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubQuantityRelation"


    // $ANTLR start "ruleSubQuantityRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1843:1: ruleSubQuantityRelation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleEInt ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleEInt ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleEInt ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleEInt ) ) otherlv_17= ']' )? otherlv_18= ';' ) ;
    public final EObject ruleSubQuantityRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_1_0=null;
        Token lv_partIsInseparable_2_0=null;
        Token lv_partIsImmutable_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_7_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_9_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_16_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1846:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleEInt ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleEInt ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleEInt ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleEInt ) ) otherlv_17= ']' )? otherlv_18= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1847:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleEInt ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleEInt ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleEInt ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleEInt ) ) otherlv_17= ']' )? otherlv_18= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1847:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleEInt ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleEInt ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleEInt ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleEInt ) ) otherlv_17= ']' )? otherlv_18= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1847:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleEInt ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleEInt ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleEInt ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleEInt ) ) otherlv_17= ']' )? otherlv_18= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1847:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1849:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1849:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1850:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1853:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1854:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1854:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=4;
                int LA23_0 = input.LA(1);

                if ( LA23_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 1) ) {
                    alt23=2;
                }
                else if ( LA23_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 2) ) {
                    alt23=3;
                }


                switch (alt23) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1856:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1856:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1857:5: {...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1857:116: ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1858:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1861:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1861:7: {...}? => ( (lv_partIsEssential_1_0= 'essential' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1861:16: ( (lv_partIsEssential_1_0= 'essential' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1862:1: (lv_partIsEssential_1_0= 'essential' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1862:1: (lv_partIsEssential_1_0= 'essential' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1863:3: lv_partIsEssential_1_0= 'essential'
            	    {
            	    lv_partIsEssential_1_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSubQuantityRelation4470); 

            	            newLeafNode(lv_partIsEssential_1_0, grammarAccess.getSubQuantityRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsEssential", true, "essential");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1883:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1883:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1884:5: {...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1884:116: ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1885:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1888:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1888:7: {...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1888:16: ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1889:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1889:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1890:3: lv_partIsInseparable_2_0= 'inseparable'
            	    {
            	    lv_partIsInseparable_2_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSubQuantityRelation4555); 

            	            newLeafNode(lv_partIsInseparable_2_0, grammarAccess.getSubQuantityRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1910:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1910:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1911:5: {...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1911:116: ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1912:6: ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1915:6: ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1915:7: {...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1915:16: ( (lv_partIsImmutable_3_0= 'immutable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1916:1: (lv_partIsImmutable_3_0= 'immutable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1916:1: (lv_partIsImmutable_3_0= 'immutable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1917:3: lv_partIsImmutable_3_0= 'immutable'
            	    {
            	    lv_partIsImmutable_3_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSubQuantityRelation4640); 

            	            newLeafNode(lv_partIsImmutable_3_0, grammarAccess.getSubQuantityRelationAccess().getPartIsImmutableImmutableKeyword_0_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsImmutable", true, "immutable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleSubQuantityRelation", "getUnorderedGroupHelper().canLeave(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            	

            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSubQuantityRelation4711); 

                	newLeafNode(otherlv_4, grammarAccess.getSubQuantityRelationAccess().getRelationKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1949:1: ( (otherlv_5= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1950:1: (otherlv_5= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1950:1: (otherlv_5= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1951:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubQuantityRelation4731); 

            		newLeafNode(otherlv_5, grammarAccess.getSubQuantityRelationAccess().getPartSubstantialUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1962:2: (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleEInt ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleEInt ) ) otherlv_10= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1962:4: otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleEInt ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleEInt ) ) otherlv_10= ']'
                    {
                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSubQuantityRelation4744); 

                        	newLeafNode(otherlv_6, grammarAccess.getSubQuantityRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1966:1: ( (lv_sourceLowerBound_7_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1967:1: (lv_sourceLowerBound_7_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1967:1: (lv_sourceLowerBound_7_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1968:3: lv_sourceLowerBound_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubQuantityRelation4765);
                    lv_sourceLowerBound_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSubQuantityRelation4777); 

                        	newLeafNode(otherlv_8, grammarAccess.getSubQuantityRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1988:1: ( (lv_sourceUpperBound_9_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1989:1: (lv_sourceUpperBound_9_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1989:1: (lv_sourceUpperBound_9_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1990:3: lv_sourceUpperBound_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubQuantityRelation4798);
                    lv_sourceUpperBound_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSubQuantityRelation4810); 

                        	newLeafNode(otherlv_10, grammarAccess.getSubQuantityRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSubQuantityRelation4824); 

                	newLeafNode(otherlv_11, grammarAccess.getSubQuantityRelationAccess().getIsSubQuantityOfKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2014:1: ( (otherlv_12= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2015:1: (otherlv_12= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2015:1: (otherlv_12= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2016:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubQuantityRelation4844); 

            		newLeafNode(otherlv_12, grammarAccess.getSubQuantityRelationAccess().getWholeSubstantialUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2027:2: (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleEInt ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleEInt ) ) otherlv_17= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2027:4: otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleEInt ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleEInt ) ) otherlv_17= ']'
                    {
                    otherlv_13=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSubQuantityRelation4857); 

                        	newLeafNode(otherlv_13, grammarAccess.getSubQuantityRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2031:1: ( (lv_targetLowerBound_14_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2032:1: (lv_targetLowerBound_14_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2032:1: (lv_targetLowerBound_14_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2033:3: lv_targetLowerBound_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getTargetLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubQuantityRelation4878);
                    lv_targetLowerBound_14_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_14_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSubQuantityRelation4890); 

                        	newLeafNode(otherlv_15, grammarAccess.getSubQuantityRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2053:1: ( (lv_targetUpperBound_16_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2054:1: (lv_targetUpperBound_16_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2054:1: (lv_targetUpperBound_16_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2055:3: lv_targetUpperBound_16_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getTargetUpperBoundEIntParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubQuantityRelation4911);
                    lv_targetUpperBound_16_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_16_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSubQuantityRelation4923); 

                        	newLeafNode(otherlv_17, grammarAccess.getSubQuantityRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSubQuantityRelation4937); 

                	newLeafNode(otherlv_18, grammarAccess.getSubQuantityRelationAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubQuantityRelation"


    // $ANTLR start "entryRuleKind"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2087:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2088:2: (iv_ruleKind= ruleKind EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2089:2: iv_ruleKind= ruleKind EOF
            {
             newCompositeNode(grammarAccess.getKindRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKind_in_entryRuleKind4973);
            iv_ruleKind=ruleKind();

            state._fsp--;

             current =iv_ruleKind; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKind4983); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2096:1: ruleKind returns [EObject current=null] : ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2099:28: ( ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2100:1: ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2100:1: ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2100:2: () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2100:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2101:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKindAccess().getKindAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleKind5029); 

                	newLeafNode(otherlv_1, grammarAccess.getKindAccess().getKindKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2110:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2111:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2111:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2112:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKind5046); 

            			newLeafNode(lv_name_2_0, grammarAccess.getKindAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKindRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleKind5063); 

                	newLeafNode(otherlv_3, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2132:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==32||LA26_0==61) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2133:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2133:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2134:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKindAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleKind5084);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKindRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleKind5097); 

                	newLeafNode(otherlv_5, grammarAccess.getKindAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKind"


    // $ANTLR start "entryRuleQuantityUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2162:1: entryRuleQuantityUniversal returns [EObject current=null] : iv_ruleQuantityUniversal= ruleQuantityUniversal EOF ;
    public final EObject entryRuleQuantityUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantityUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2163:2: (iv_ruleQuantityUniversal= ruleQuantityUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2164:2: iv_ruleQuantityUniversal= ruleQuantityUniversal EOF
            {
             newCompositeNode(grammarAccess.getQuantityUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuantityUniversal_in_entryRuleQuantityUniversal5133);
            iv_ruleQuantityUniversal=ruleQuantityUniversal();

            state._fsp--;

             current =iv_ruleQuantityUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuantityUniversal5143); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantityUniversal"


    // $ANTLR start "ruleQuantityUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2171:1: ruleQuantityUniversal returns [EObject current=null] : ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleQuantityUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2174:28: ( ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2175:1: ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2175:1: ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2175:2: () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2175:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2176:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQuantityUniversalAccess().getQuantityUniversalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleQuantityUniversal5189); 

                	newLeafNode(otherlv_1, grammarAccess.getQuantityUniversalAccess().getQuantityKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2185:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2186:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2186:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2187:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQuantityUniversal5206); 

            			newLeafNode(lv_name_2_0, grammarAccess.getQuantityUniversalAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuantityUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQuantityUniversal5223); 

                	newLeafNode(otherlv_3, grammarAccess.getQuantityUniversalAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2207:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==32||LA27_0==61) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2208:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2208:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2209:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuantityUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleQuantityUniversal5244);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuantityUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleQuantityUniversal5257); 

                	newLeafNode(otherlv_5, grammarAccess.getQuantityUniversalAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantityUniversal"


    // $ANTLR start "entryRuleCollectiveUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2237:1: entryRuleCollectiveUniversal returns [EObject current=null] : iv_ruleCollectiveUniversal= ruleCollectiveUniversal EOF ;
    public final EObject entryRuleCollectiveUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectiveUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2238:2: (iv_ruleCollectiveUniversal= ruleCollectiveUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2239:2: iv_ruleCollectiveUniversal= ruleCollectiveUniversal EOF
            {
             newCompositeNode(grammarAccess.getCollectiveUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCollectiveUniversal_in_entryRuleCollectiveUniversal5293);
            iv_ruleCollectiveUniversal=ruleCollectiveUniversal();

            state._fsp--;

             current =iv_ruleCollectiveUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectiveUniversal5303); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectiveUniversal"


    // $ANTLR start "ruleCollectiveUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2246:1: ruleCollectiveUniversal returns [EObject current=null] : ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleCollectiveUniversal() throws RecognitionException {
        EObject current = null;

        Token lv_isExtensional_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2249:28: ( ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2250:1: ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2250:1: ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2250:2: ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2250:2: ( (lv_isExtensional_0_0= 'extensional' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2251:1: (lv_isExtensional_0_0= 'extensional' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2251:1: (lv_isExtensional_0_0= 'extensional' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2252:3: lv_isExtensional_0_0= 'extensional'
                    {
                    lv_isExtensional_0_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleCollectiveUniversal5346); 

                            newLeafNode(lv_isExtensional_0_0, grammarAccess.getCollectiveUniversalAccess().getIsExtensionalExtensionalKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectiveUniversalRule());
                    	        }
                           		setWithLastConsumed(current, "isExtensional", true, "extensional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleCollectiveUniversal5372); 

                	newLeafNode(otherlv_1, grammarAccess.getCollectiveUniversalAccess().getCollectiveUniversalKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2269:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2270:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2270:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2271:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCollectiveUniversal5389); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCollectiveUniversalAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectiveUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCollectiveUniversal5406); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectiveUniversalAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2291:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==32||LA29_0==61) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2292:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2292:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2293:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCollectiveUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleCollectiveUniversal5427);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCollectiveUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCollectiveUniversal5440); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectiveUniversalAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectiveUniversal"


    // $ANTLR start "entryRuleSubKind"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2321:1: entryRuleSubKind returns [EObject current=null] : iv_ruleSubKind= ruleSubKind EOF ;
    public final EObject entryRuleSubKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubKind = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2322:2: (iv_ruleSubKind= ruleSubKind EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2323:2: iv_ruleSubKind= ruleSubKind EOF
            {
             newCompositeNode(grammarAccess.getSubKindRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubKind_in_entryRuleSubKind5476);
            iv_ruleSubKind=ruleSubKind();

            state._fsp--;

             current =iv_ruleSubKind; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubKind5486); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubKind"


    // $ANTLR start "ruleSubKind"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2330:1: ruleSubKind returns [EObject current=null] : ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleSubKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2333:28: ( ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2334:1: ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2334:1: ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2334:2: () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2334:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2335:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubKindAccess().getSubKindAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleSubKind5532); 

                	newLeafNode(otherlv_1, grammarAccess.getSubKindAccess().getSubKindKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2344:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2345:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2345:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2346:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubKind5549); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSubKindAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubKindRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSubKind5566); 

                	newLeafNode(otherlv_3, grammarAccess.getSubKindAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2366:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==32||LA30_0==61) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2367:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2367:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2368:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubKindAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleSubKind5587);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubKindRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSubKind5600); 

                	newLeafNode(otherlv_5, grammarAccess.getSubKindAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubKind"


    // $ANTLR start "entryRuleRole"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2396:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2397:2: (iv_ruleRole= ruleRole EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2398:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole5636);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole5646); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2405:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_characterizedBy_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2408:28: ( (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2409:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2409:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2409:3: otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleRole5683); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2413:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2414:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2414:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2415:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRole5700); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRole5717); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2435:1: ( (lv_characterizedBy_3_0= ruleCharacterization ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==32||LA31_0==61) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2436:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2436:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2437:3: lv_characterizedBy_3_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleAccess().getCharacterizedByCharacterizationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleRole5738);
            	    lv_characterizedBy_3_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_3_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRole5751); 

                	newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRulePhase"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2465:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2466:2: (iv_rulePhase= rulePhase EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2467:2: iv_rulePhase= rulePhase EOF
            {
             newCompositeNode(grammarAccess.getPhaseRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePhase_in_entryRulePhase5787);
            iv_rulePhase=rulePhase();

            state._fsp--;

             current =iv_rulePhase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePhase5797); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2474:1: rulePhase returns [EObject current=null] : ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2477:28: ( ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2478:1: ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2478:1: ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2478:2: () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2478:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2479:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPhaseAccess().getPhaseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_rulePhase5843); 

                	newLeafNode(otherlv_1, grammarAccess.getPhaseAccess().getPhaseKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2488:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2489:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2489:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2490:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePhase5860); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPhaseAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPhaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePhase5877); 

                	newLeafNode(otherlv_3, grammarAccess.getPhaseAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2510:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==32||LA32_0==61) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2511:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2511:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2512:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPhaseAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_rulePhase5898);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPhaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePhase5911); 

                	newLeafNode(otherlv_5, grammarAccess.getPhaseAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRuleCategory"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2540:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2541:2: (iv_ruleCategory= ruleCategory EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2542:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_entryRuleCategory5947);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCategory5957); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2549:1: ruleCategory returns [EObject current=null] : ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2552:28: ( ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2553:1: ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2553:1: ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2553:2: () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2553:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2554:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCategoryAccess().getCategoryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleCategory6003); 

                	newLeafNode(otherlv_1, grammarAccess.getCategoryAccess().getCategoryKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2563:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2564:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2564:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2565:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCategory6020); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCategory6037); 

                	newLeafNode(otherlv_3, grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCategory6049); 

                	newLeafNode(otherlv_4, grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleMixin"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2597:1: entryRuleMixin returns [EObject current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final EObject entryRuleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixin = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2598:2: (iv_ruleMixin= ruleMixin EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2599:2: iv_ruleMixin= ruleMixin EOF
            {
             newCompositeNode(grammarAccess.getMixinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMixin_in_entryRuleMixin6085);
            iv_ruleMixin=ruleMixin();

            state._fsp--;

             current =iv_ruleMixin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMixin6095); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMixin"


    // $ANTLR start "ruleMixin"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2606:1: ruleMixin returns [EObject current=null] : ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleMixin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2609:28: ( ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2610:1: ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2610:1: ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2610:2: () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2610:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2611:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMixinAccess().getMixinAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleMixin6141); 

                	newLeafNode(otherlv_1, grammarAccess.getMixinAccess().getMixinKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2620:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2621:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2621:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2622:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMixin6158); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMixinAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMixinRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMixin6175); 

                	newLeafNode(otherlv_3, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMixin6187); 

                	newLeafNode(otherlv_4, grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMixin"


    // $ANTLR start "entryRuleRoleMixin"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2654:1: entryRuleRoleMixin returns [EObject current=null] : iv_ruleRoleMixin= ruleRoleMixin EOF ;
    public final EObject entryRuleRoleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleMixin = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2655:2: (iv_ruleRoleMixin= ruleRoleMixin EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2656:2: iv_ruleRoleMixin= ruleRoleMixin EOF
            {
             newCompositeNode(grammarAccess.getRoleMixinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoleMixin_in_entryRuleRoleMixin6223);
            iv_ruleRoleMixin=ruleRoleMixin();

            state._fsp--;

             current =iv_ruleRoleMixin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoleMixin6233); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoleMixin"


    // $ANTLR start "ruleRoleMixin"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2663:1: ruleRoleMixin returns [EObject current=null] : (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleRoleMixin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2666:28: ( (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2667:1: (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2667:1: (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2667:3: otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleRoleMixin6270); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleMixinAccess().getRoleMixinKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2671:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2672:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2672:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2673:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRoleMixin6287); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRoleMixinAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleMixinRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRoleMixin6304); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleMixinAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRoleMixin6316); 

                	newLeafNode(otherlv_3, grammarAccess.getRoleMixinAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoleMixin"


    // $ANTLR start "entryRuleRelatorUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2705:1: entryRuleRelatorUniversal returns [EObject current=null] : iv_ruleRelatorUniversal= ruleRelatorUniversal EOF ;
    public final EObject entryRuleRelatorUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelatorUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2706:2: (iv_ruleRelatorUniversal= ruleRelatorUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2707:2: iv_ruleRelatorUniversal= ruleRelatorUniversal EOF
            {
             newCompositeNode(grammarAccess.getRelatorUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelatorUniversal_in_entryRuleRelatorUniversal6352);
            iv_ruleRelatorUniversal=ruleRelatorUniversal();

            state._fsp--;

             current =iv_ruleRelatorUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelatorUniversal6362); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelatorUniversal"


    // $ANTLR start "ruleRelatorUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2714:1: ruleRelatorUniversal returns [EObject current=null] : (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' ) ;
    public final EObject ruleRelatorUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_3_0 = null;

        EObject lv_mediations_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2717:28: ( (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2718:1: (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2718:1: (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2718:3: otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleRelatorUniversal6399); 

                	newLeafNode(otherlv_0, grammarAccess.getRelatorUniversalAccess().getRelatorUniversalKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2722:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2723:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2723:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2724:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRelatorUniversal6416); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRelatorUniversalAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelatorUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRelatorUniversal6433); 

                	newLeafNode(otherlv_2, grammarAccess.getRelatorUniversalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2744:1: ( (lv_characterizedBy_3_0= ruleCharacterization ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==32||LA33_0==61) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2745:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2745:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2746:3: lv_characterizedBy_3_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelatorUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleRelatorUniversal6454);
            	    lv_characterizedBy_3_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelatorUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_3_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2762:3: ( (lv_mediations_4_0= ruleMediation ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==62) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2763:1: (lv_mediations_4_0= ruleMediation )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2763:1: (lv_mediations_4_0= ruleMediation )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2764:3: lv_mediations_4_0= ruleMediation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelatorUniversalAccess().getMediationsMediationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMediation_in_ruleRelatorUniversal6476);
            	    lv_mediations_4_0=ruleMediation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelatorUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mediations",
            	            		lv_mediations_4_0, 
            	            		"Mediation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRelatorUniversal6489); 

                	newLeafNode(otherlv_5, grammarAccess.getRelatorUniversalAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelatorUniversal"


    // $ANTLR start "entryRuleBinaryMaterialRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2792:1: entryRuleBinaryMaterialRelation returns [EObject current=null] : iv_ruleBinaryMaterialRelation= ruleBinaryMaterialRelation EOF ;
    public final EObject entryRuleBinaryMaterialRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryMaterialRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2793:2: (iv_ruleBinaryMaterialRelation= ruleBinaryMaterialRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2794:2: iv_ruleBinaryMaterialRelation= ruleBinaryMaterialRelation EOF
            {
             newCompositeNode(grammarAccess.getBinaryMaterialRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryMaterialRelation_in_entryRuleBinaryMaterialRelation6525);
            iv_ruleBinaryMaterialRelation=ruleBinaryMaterialRelation();

            state._fsp--;

             current =iv_ruleBinaryMaterialRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryMaterialRelation6535); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryMaterialRelation"


    // $ANTLR start "ruleBinaryMaterialRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2801:1: ruleBinaryMaterialRelation returns [EObject current=null] : (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) ;
    public final EObject ruleBinaryMaterialRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_4_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_6_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_15_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_17_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2804:28: ( (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2805:1: (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2805:1: (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2805:3: otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleBinaryMaterialRelation6572); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryMaterialRelationAccess().getMaterialKeyword_0());
                
            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleBinaryMaterialRelation6584); 

                	newLeafNode(otherlv_1, grammarAccess.getBinaryMaterialRelationAccess().getRelKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2813:1: ( (otherlv_2= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2814:1: (otherlv_2= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2814:1: (otherlv_2= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2815:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6604); 

            		newLeafNode(otherlv_2, grammarAccess.getBinaryMaterialRelationAccess().getSourceExternallyDependentUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2826:2: (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2826:4: otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryMaterialRelation6617); 

                        	newLeafNode(otherlv_3, grammarAccess.getBinaryMaterialRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2830:1: ( (lv_sourceLowerBound_4_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2831:1: (lv_sourceLowerBound_4_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2831:1: (lv_sourceLowerBound_4_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2832:3: lv_sourceLowerBound_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6638);
                    lv_sourceLowerBound_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBinaryMaterialRelation6650); 

                        	newLeafNode(otherlv_5, grammarAccess.getBinaryMaterialRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2852:1: ( (lv_sourceUpperBound_6_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2853:1: (lv_sourceUpperBound_6_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2853:1: (lv_sourceUpperBound_6_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2854:3: lv_sourceUpperBound_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6671);
                    lv_sourceUpperBound_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleBinaryMaterialRelation6683); 

                        	newLeafNode(otherlv_7, grammarAccess.getBinaryMaterialRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2874:3: ( (lv_name_8_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2875:1: (lv_name_8_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2875:1: (lv_name_8_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2876:3: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6702); 

            			newLeafNode(lv_name_8_0, grammarAccess.getBinaryMaterialRelationAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_8_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2892:2: (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2892:4: otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')'
                    {
                    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBinaryMaterialRelation6720); 

                        	newLeafNode(otherlv_9, grammarAccess.getBinaryMaterialRelationAccess().getLeftParenthesisKeyword_5_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2896:1: ( (otherlv_10= RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2897:1: (otherlv_10= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2897:1: (otherlv_10= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2898:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6740); 

                    		newLeafNode(otherlv_10, grammarAccess.getBinaryMaterialRelationAccess().getDerivedFromRelatorUniversalCrossReference_5_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBinaryMaterialRelation6752); 

                        	newLeafNode(otherlv_11, grammarAccess.getBinaryMaterialRelationAccess().getRightParenthesisKeyword_5_2());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleBinaryMaterialRelation6766); 

                	newLeafNode(otherlv_12, grammarAccess.getBinaryMaterialRelationAccess().getTargetKeyword_6());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2917:1: ( (otherlv_13= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2918:1: (otherlv_13= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2918:1: (otherlv_13= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2919:3: otherlv_13= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
            	        }
                    
            otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6786); 

            		newLeafNode(otherlv_13, grammarAccess.getBinaryMaterialRelationAccess().getTargetExternallyDependentUniversalCrossReference_7_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2930:2: (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2930:4: otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']'
                    {
                    otherlv_14=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryMaterialRelation6799); 

                        	newLeafNode(otherlv_14, grammarAccess.getBinaryMaterialRelationAccess().getLeftSquareBracketKeyword_8_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2934:1: ( (lv_targetLowerBound_15_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2935:1: (lv_targetLowerBound_15_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2935:1: (lv_targetLowerBound_15_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2936:3: lv_targetLowerBound_15_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getTargetLowerBoundEIntParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6820);
                    lv_targetLowerBound_15_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_15_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBinaryMaterialRelation6832); 

                        	newLeafNode(otherlv_16, grammarAccess.getBinaryMaterialRelationAccess().getFullStopFullStopKeyword_8_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2956:1: ( (lv_targetUpperBound_17_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2957:1: (lv_targetUpperBound_17_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2957:1: (lv_targetUpperBound_17_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2958:3: lv_targetUpperBound_17_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getTargetUpperBoundEIntParserRuleCall_8_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6853);
                    lv_targetUpperBound_17_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_17_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleBinaryMaterialRelation6865); 

                        	newLeafNode(otherlv_18, grammarAccess.getBinaryMaterialRelationAccess().getRightSquareBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBinaryMaterialRelation6879); 

                	newLeafNode(otherlv_19, grammarAccess.getBinaryMaterialRelationAccess().getSemicolonKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryMaterialRelation"


    // $ANTLR start "entryRuleBinaryFormalRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2990:1: entryRuleBinaryFormalRelation returns [EObject current=null] : iv_ruleBinaryFormalRelation= ruleBinaryFormalRelation EOF ;
    public final EObject entryRuleBinaryFormalRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryFormalRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2991:2: (iv_ruleBinaryFormalRelation= ruleBinaryFormalRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2992:2: iv_ruleBinaryFormalRelation= ruleBinaryFormalRelation EOF
            {
             newCompositeNode(grammarAccess.getBinaryFormalRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryFormalRelation_in_entryRuleBinaryFormalRelation6915);
            iv_ruleBinaryFormalRelation=ruleBinaryFormalRelation();

            state._fsp--;

             current =iv_ruleBinaryFormalRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryFormalRelation6925); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryFormalRelation"


    // $ANTLR start "ruleBinaryFormalRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2999:1: ruleBinaryFormalRelation returns [EObject current=null] : (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleEInt ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleEInt ) ) otherlv_14= ']' )? otherlv_15= ';' ) ;
    public final EObject ruleBinaryFormalRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_4_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_6_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_11_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_13_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3002:28: ( (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleEInt ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleEInt ) ) otherlv_14= ']' )? otherlv_15= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3003:1: (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleEInt ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleEInt ) ) otherlv_14= ']' )? otherlv_15= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3003:1: (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleEInt ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleEInt ) ) otherlv_14= ']' )? otherlv_15= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3003:3: otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleEInt ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleEInt ) ) otherlv_14= ']' )? otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleBinaryFormalRelation6962); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryFormalRelationAccess().getFormalKeyword_0());
                
            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleBinaryFormalRelation6974); 

                	newLeafNode(otherlv_1, grammarAccess.getBinaryFormalRelationAccess().getRelKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3011:1: ( (otherlv_2= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3012:1: (otherlv_2= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3012:1: (otherlv_2= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3013:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryFormalRelationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryFormalRelation6994); 

            		newLeafNode(otherlv_2, grammarAccess.getBinaryFormalRelationAccess().getSourceUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3024:2: (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3024:4: otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryFormalRelation7007); 

                        	newLeafNode(otherlv_3, grammarAccess.getBinaryFormalRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3028:1: ( (lv_sourceLowerBound_4_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3029:1: (lv_sourceLowerBound_4_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3029:1: (lv_sourceLowerBound_4_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3030:3: lv_sourceLowerBound_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryFormalRelation7028);
                    lv_sourceLowerBound_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBinaryFormalRelation7040); 

                        	newLeafNode(otherlv_5, grammarAccess.getBinaryFormalRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3050:1: ( (lv_sourceUpperBound_6_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3051:1: (lv_sourceUpperBound_6_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3051:1: (lv_sourceUpperBound_6_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3052:3: lv_sourceUpperBound_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryFormalRelation7061);
                    lv_sourceUpperBound_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleBinaryFormalRelation7073); 

                        	newLeafNode(otherlv_7, grammarAccess.getBinaryFormalRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3072:3: ( (lv_name_8_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3073:1: (lv_name_8_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3073:1: (lv_name_8_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3074:3: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryFormalRelation7092); 

            			newLeafNode(lv_name_8_0, grammarAccess.getBinaryFormalRelationAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryFormalRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_8_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3090:2: ( (otherlv_9= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3091:1: (otherlv_9= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3091:1: (otherlv_9= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3092:3: otherlv_9= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryFormalRelationRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryFormalRelation7117); 

            		newLeafNode(otherlv_9, grammarAccess.getBinaryFormalRelationAccess().getTargetUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3103:2: (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleEInt ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleEInt ) ) otherlv_14= ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3103:4: otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleEInt ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleEInt ) ) otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryFormalRelation7130); 

                        	newLeafNode(otherlv_10, grammarAccess.getBinaryFormalRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3107:1: ( (lv_targetLowerBound_11_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3108:1: (lv_targetLowerBound_11_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3108:1: (lv_targetLowerBound_11_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3109:3: lv_targetLowerBound_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getTargetLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryFormalRelation7151);
                    lv_targetLowerBound_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBinaryFormalRelation7163); 

                        	newLeafNode(otherlv_12, grammarAccess.getBinaryFormalRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3129:1: ( (lv_targetUpperBound_13_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3130:1: (lv_targetUpperBound_13_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3130:1: (lv_targetUpperBound_13_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3131:3: lv_targetUpperBound_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getTargetUpperBoundEIntParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryFormalRelation7184);
                    lv_targetUpperBound_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleBinaryFormalRelation7196); 

                        	newLeafNode(otherlv_14, grammarAccess.getBinaryFormalRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBinaryFormalRelation7210); 

                	newLeafNode(otherlv_15, grammarAccess.getBinaryFormalRelationAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryFormalRelation"


    // $ANTLR start "entryRuleModeUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3163:1: entryRuleModeUniversal returns [EObject current=null] : iv_ruleModeUniversal= ruleModeUniversal EOF ;
    public final EObject entryRuleModeUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3164:2: (iv_ruleModeUniversal= ruleModeUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3165:2: iv_ruleModeUniversal= ruleModeUniversal EOF
            {
             newCompositeNode(grammarAccess.getModeUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModeUniversal_in_entryRuleModeUniversal7246);
            iv_ruleModeUniversal=ruleModeUniversal();

            state._fsp--;

             current =iv_ruleModeUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModeUniversal7256); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModeUniversal"


    // $ANTLR start "ruleModeUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3172:1: ruleModeUniversal returns [EObject current=null] : (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) ;
    public final EObject ruleModeUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_characterizedBy_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3175:28: ( (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3176:1: (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3176:1: (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3176:3: otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleModeUniversal7293); 

                	newLeafNode(otherlv_0, grammarAccess.getModeUniversalAccess().getModeUniversalKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3180:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3181:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3181:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3182:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModeUniversal7310); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModeUniversalAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModeUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModeUniversal7327); 

                	newLeafNode(otherlv_2, grammarAccess.getModeUniversalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3202:1: ( (lv_characterizedBy_3_0= ruleCharacterization ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==32||LA40_0==61) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3203:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3203:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3204:3: lv_characterizedBy_3_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModeUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleModeUniversal7348);
            	    lv_characterizedBy_3_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModeUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_3_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModeUniversal7361); 

                	newLeafNode(otherlv_4, grammarAccess.getModeUniversalAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModeUniversal"


    // $ANTLR start "entryRuleQualityUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3232:1: entryRuleQualityUniversal returns [EObject current=null] : iv_ruleQualityUniversal= ruleQualityUniversal EOF ;
    public final EObject entryRuleQualityUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3233:2: (iv_ruleQualityUniversal= ruleQualityUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3234:2: iv_ruleQualityUniversal= ruleQualityUniversal EOF
            {
             newCompositeNode(grammarAccess.getQualityUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualityUniversal_in_entryRuleQualityUniversal7397);
            iv_ruleQualityUniversal=ruleQualityUniversal();

            state._fsp--;

             current =iv_ruleQualityUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualityUniversal7407); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualityUniversal"


    // $ANTLR start "ruleQualityUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3241:1: ruleQualityUniversal returns [EObject current=null] : (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' ) ;
    public final EObject ruleQualityUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_characterizedBy_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3244:28: ( (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3245:1: (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3245:1: (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3245:3: otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleQualityUniversal7444); 

                	newLeafNode(otherlv_0, grammarAccess.getQualityUniversalAccess().getQualityUniversalKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3249:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3250:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3250:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3251:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualityUniversal7461); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQualityUniversalAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQualityUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleQualityUniversal7478); 

                	newLeafNode(otherlv_2, grammarAccess.getQualityUniversalAccess().getCharacterizesKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3271:1: ( (otherlv_3= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3272:1: (otherlv_3= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3272:1: (otherlv_3= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3273:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQualityUniversalRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualityUniversal7498); 

            		newLeafNode(otherlv_3, grammarAccess.getQualityUniversalAccess().getCharacterizationCharacterizationCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQualityUniversal7510); 

                	newLeafNode(otherlv_4, grammarAccess.getQualityUniversalAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3288:1: (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==57) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3288:3: otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleQualityUniversal7523); 

                        	newLeafNode(otherlv_5, grammarAccess.getQualityUniversalAccess().getDatatypesKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleQualityUniversal7535); 

                        	newLeafNode(otherlv_6, grammarAccess.getQualityUniversalAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3296:1: ( (otherlv_7= RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3297:1: (otherlv_7= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3297:1: (otherlv_7= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3298:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQualityUniversalRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualityUniversal7555); 

                    		newLeafNode(otherlv_7, grammarAccess.getQualityUniversalAccess().getDatatypesDataTypeCrossReference_5_2_0()); 
                    	

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3309:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==18) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3309:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQualityUniversal7568); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getQualityUniversalAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3313:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3314:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3314:1: (otherlv_9= RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3315:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getQualityUniversalRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualityUniversal7588); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getQualityUniversalAccess().getDatatypesDataTypeCrossReference_5_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleQualityUniversal7602); 

                        	newLeafNode(otherlv_10, grammarAccess.getQualityUniversalAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3330:3: ( (lv_characterizedBy_11_0= ruleCharacterization ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==32||LA43_0==61) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3331:1: (lv_characterizedBy_11_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3331:1: (lv_characterizedBy_11_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3332:3: lv_characterizedBy_11_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQualityUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleQualityUniversal7625);
            	    lv_characterizedBy_11_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQualityUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_11_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleQualityUniversal7638); 

                	newLeafNode(otherlv_12, grammarAccess.getQualityUniversalAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualityUniversal"


    // $ANTLR start "entryRulenAryMaterialRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3360:1: entryRulenAryMaterialRelation returns [EObject current=null] : iv_rulenAryMaterialRelation= rulenAryMaterialRelation EOF ;
    public final EObject entryRulenAryMaterialRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenAryMaterialRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3361:2: (iv_rulenAryMaterialRelation= rulenAryMaterialRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3362:2: iv_rulenAryMaterialRelation= rulenAryMaterialRelation EOF
            {
             newCompositeNode(grammarAccess.getNAryMaterialRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulenAryMaterialRelation_in_entryRulenAryMaterialRelation7674);
            iv_rulenAryMaterialRelation=rulenAryMaterialRelation();

            state._fsp--;

             current =iv_rulenAryMaterialRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulenAryMaterialRelation7684); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenAryMaterialRelation"


    // $ANTLR start "rulenAryMaterialRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3369:1: rulenAryMaterialRelation returns [EObject current=null] : (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' ) )? otherlv_17= ';' ) ;
    public final EObject rulenAryMaterialRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_6_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_8_0 = null;

        AntlrDatatypeRuleToken lv_sourceLowerBound_13_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_15_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3372:28: ( (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' ) )? otherlv_17= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3373:1: (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' ) )? otherlv_17= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3373:1: (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' ) )? otherlv_17= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3373:3: otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' ) )? otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_rulenAryMaterialRelation7721); 

                	newLeafNode(otherlv_0, grammarAccess.getNAryMaterialRelationAccess().getMaterialKeyword_0());
                
            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_rulenAryMaterialRelation7733); 

                	newLeafNode(otherlv_1, grammarAccess.getNAryMaterialRelationAccess().getAssocKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3381:1: ( (otherlv_2= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3382:1: (otherlv_2= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3382:1: (otherlv_2= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3383:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryMaterialRelation7753); 

            		newLeafNode(otherlv_2, grammarAccess.getNAryMaterialRelationAccess().getDerivedFromRelatorUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3394:2: ( (lv_name_3_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3395:1: (lv_name_3_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3395:1: (lv_name_3_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3396:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryMaterialRelation7770); 

            			newLeafNode(lv_name_3_0, grammarAccess.getNAryMaterialRelationAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3412:2: ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3412:3: ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3412:3: ( (otherlv_4= RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3413:1: (otherlv_4= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3413:1: (otherlv_4= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3414:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryMaterialRelation7796); 

                    		newLeafNode(otherlv_4, grammarAccess.getNAryMaterialRelationAccess().getTargetRelataExternallyDependentUniversalCrossReference_4_0_0()); 
                    	

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3425:2: (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3425:4: otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulenAryMaterialRelation7809); 

                        	newLeafNode(otherlv_5, grammarAccess.getNAryMaterialRelationAccess().getLeftSquareBracketKeyword_4_1_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3429:1: ( (lv_sourceLowerBound_6_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3430:1: (lv_sourceLowerBound_6_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3430:1: (lv_sourceLowerBound_6_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3431:3: lv_sourceLowerBound_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceLowerBoundEIntParserRuleCall_4_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryMaterialRelation7830);
                    lv_sourceLowerBound_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulenAryMaterialRelation7842); 

                        	newLeafNode(otherlv_7, grammarAccess.getNAryMaterialRelationAccess().getFullStopFullStopKeyword_4_1_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3451:1: ( (lv_sourceUpperBound_8_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3452:1: (lv_sourceUpperBound_8_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3452:1: (lv_sourceUpperBound_8_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3453:3: lv_sourceUpperBound_8_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceUpperBoundEIntParserRuleCall_4_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryMaterialRelation7863);
                    lv_sourceUpperBound_8_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_8_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulenAryMaterialRelation7875); 

                        	newLeafNode(otherlv_9, grammarAccess.getNAryMaterialRelationAccess().getRightSquareBracketKeyword_4_1_4());
                        

                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3473:2: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==18) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3473:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulenAryMaterialRelation7889); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getNAryMaterialRelationAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3477:1: ( (otherlv_11= RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3478:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3478:1: (otherlv_11= RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3479:3: otherlv_11= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
                    	    	        }
                    	            
                    	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryMaterialRelation7909); 

                    	    		newLeafNode(otherlv_11, grammarAccess.getNAryMaterialRelationAccess().getTargetRelataExternallyDependentUniversalCrossReference_4_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3490:4: (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3490:6: otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']'
                    {
                    otherlv_12=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulenAryMaterialRelation7924); 

                        	newLeafNode(otherlv_12, grammarAccess.getNAryMaterialRelationAccess().getLeftSquareBracketKeyword_4_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3494:1: ( (lv_sourceLowerBound_13_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3495:1: (lv_sourceLowerBound_13_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3495:1: (lv_sourceLowerBound_13_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3496:3: lv_sourceLowerBound_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceLowerBoundEIntParserRuleCall_4_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryMaterialRelation7945);
                    lv_sourceLowerBound_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulenAryMaterialRelation7957); 

                        	newLeafNode(otherlv_14, grammarAccess.getNAryMaterialRelationAccess().getFullStopFullStopKeyword_4_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3516:1: ( (lv_sourceUpperBound_15_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3517:1: (lv_sourceUpperBound_15_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3517:1: (lv_sourceUpperBound_15_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3518:3: lv_sourceUpperBound_15_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceUpperBoundEIntParserRuleCall_4_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryMaterialRelation7978);
                    lv_sourceUpperBound_15_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_15_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulenAryMaterialRelation7990); 

                        	newLeafNode(otherlv_16, grammarAccess.getNAryMaterialRelationAccess().getRightSquareBracketKeyword_4_3_4());
                        

                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulenAryMaterialRelation8005); 

                	newLeafNode(otherlv_17, grammarAccess.getNAryMaterialRelationAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenAryMaterialRelation"


    // $ANTLR start "entryRulenAryFormalRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3550:1: entryRulenAryFormalRelation returns [EObject current=null] : iv_rulenAryFormalRelation= rulenAryFormalRelation EOF ;
    public final EObject entryRulenAryFormalRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenAryFormalRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3551:2: (iv_rulenAryFormalRelation= rulenAryFormalRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3552:2: iv_rulenAryFormalRelation= rulenAryFormalRelation EOF
            {
             newCompositeNode(grammarAccess.getNAryFormalRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulenAryFormalRelation_in_entryRulenAryFormalRelation8041);
            iv_rulenAryFormalRelation=rulenAryFormalRelation();

            state._fsp--;

             current =iv_rulenAryFormalRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulenAryFormalRelation8051); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenAryFormalRelation"


    // $ANTLR start "rulenAryFormalRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3559:1: rulenAryFormalRelation returns [EObject current=null] : (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' ) )? otherlv_16= ';' ) ;
    public final EObject rulenAryFormalRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_7_0 = null;

        AntlrDatatypeRuleToken lv_sourceLowerBound_12_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_14_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3562:28: ( (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' ) )? otherlv_16= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3563:1: (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' ) )? otherlv_16= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3563:1: (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' ) )? otherlv_16= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3563:3: otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' ) )? otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_rulenAryFormalRelation8088); 

                	newLeafNode(otherlv_0, grammarAccess.getNAryFormalRelationAccess().getFormalKeyword_0());
                
            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_rulenAryFormalRelation8100); 

                	newLeafNode(otherlv_1, grammarAccess.getNAryFormalRelationAccess().getAssocKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3571:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3572:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3572:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3573:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryFormalRelation8117); 

            			newLeafNode(lv_name_2_0, grammarAccess.getNAryFormalRelationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNAryFormalRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3589:2: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3589:3: ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3589:3: ( (otherlv_3= RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3590:1: (otherlv_3= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3590:1: (otherlv_3= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3591:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNAryFormalRelationRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryFormalRelation8143); 

                    		newLeafNode(otherlv_3, grammarAccess.getNAryFormalRelationAccess().getTargetRelataUniversalCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3602:2: (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3602:4: otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulenAryFormalRelation8156); 

                        	newLeafNode(otherlv_4, grammarAccess.getNAryFormalRelationAccess().getLeftSquareBracketKeyword_3_1_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3606:1: ( (lv_sourceLowerBound_5_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3607:1: (lv_sourceLowerBound_5_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3607:1: (lv_sourceLowerBound_5_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3608:3: lv_sourceLowerBound_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryFormalRelation8177);
                    lv_sourceLowerBound_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulenAryFormalRelation8189); 

                        	newLeafNode(otherlv_6, grammarAccess.getNAryFormalRelationAccess().getFullStopFullStopKeyword_3_1_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3628:1: ( (lv_sourceUpperBound_7_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3629:1: (lv_sourceUpperBound_7_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3629:1: (lv_sourceUpperBound_7_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3630:3: lv_sourceUpperBound_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryFormalRelation8210);
                    lv_sourceUpperBound_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulenAryFormalRelation8222); 

                        	newLeafNode(otherlv_8, grammarAccess.getNAryFormalRelationAccess().getRightSquareBracketKeyword_3_1_4());
                        

                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3650:2: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==18) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3650:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulenAryFormalRelation8236); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getNAryFormalRelationAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3654:1: ( (otherlv_10= RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3655:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3655:1: (otherlv_10= RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3656:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNAryFormalRelationRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryFormalRelation8256); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getNAryFormalRelationAccess().getTargetRelataUniversalCrossReference_3_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3667:4: (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3667:6: otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']'
                    {
                    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulenAryFormalRelation8271); 

                        	newLeafNode(otherlv_11, grammarAccess.getNAryFormalRelationAccess().getLeftSquareBracketKeyword_3_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3671:1: ( (lv_sourceLowerBound_12_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3672:1: (lv_sourceLowerBound_12_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3672:1: (lv_sourceLowerBound_12_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3673:3: lv_sourceLowerBound_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryFormalRelation8292);
                    lv_sourceLowerBound_12_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_12_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulenAryFormalRelation8304); 

                        	newLeafNode(otherlv_13, grammarAccess.getNAryFormalRelationAccess().getFullStopFullStopKeyword_3_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3693:1: ( (lv_sourceUpperBound_14_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3694:1: (lv_sourceUpperBound_14_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3694:1: (lv_sourceUpperBound_14_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3695:3: lv_sourceUpperBound_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryFormalRelation8325);
                    lv_sourceUpperBound_14_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_14_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulenAryFormalRelation8337); 

                        	newLeafNode(otherlv_15, grammarAccess.getNAryFormalRelationAccess().getRightSquareBracketKeyword_3_3_4());
                        

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulenAryFormalRelation8352); 

                	newLeafNode(otherlv_16, grammarAccess.getNAryFormalRelationAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenAryFormalRelation"


    // $ANTLR start "entryRuleEString"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3727:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3728:2: (iv_ruleEString= ruleEString EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3729:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString8389);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString8400); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3736:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3739:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3740:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3740:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_ID) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3740:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString8440); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3748:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString8466); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePrimitiveDataTypeType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3765:1: entryRulePrimitiveDataTypeType returns [String current=null] : iv_rulePrimitiveDataTypeType= rulePrimitiveDataTypeType EOF ;
    public final String entryRulePrimitiveDataTypeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveDataTypeType = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3766:2: (iv_rulePrimitiveDataTypeType= rulePrimitiveDataTypeType EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3767:2: iv_rulePrimitiveDataTypeType= rulePrimitiveDataTypeType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveDataTypeTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveDataTypeType_in_entryRulePrimitiveDataTypeType8514);
            iv_rulePrimitiveDataTypeType=rulePrimitiveDataTypeType();

            state._fsp--;

             current =iv_rulePrimitiveDataTypeType.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveDataTypeType8525); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveDataTypeType"


    // $ANTLR start "rulePrimitiveDataTypeType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3774:1: rulePrimitiveDataTypeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'PrimitiveDataTypeType' ;
    public final AntlrDatatypeRuleToken rulePrimitiveDataTypeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3777:28: (kw= 'PrimitiveDataTypeType' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3779:2: kw= 'PrimitiveDataTypeType'
            {
            kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulePrimitiveDataTypeType8562); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPrimitiveDataTypeTypeAccess().getPrimitiveDataTypeTypeKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveDataTypeType"


    // $ANTLR start "entryRuleDataTypeAttribute"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3792:1: entryRuleDataTypeAttribute returns [EObject current=null] : iv_ruleDataTypeAttribute= ruleDataTypeAttribute EOF ;
    public final EObject entryRuleDataTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeAttribute = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3793:2: (iv_ruleDataTypeAttribute= ruleDataTypeAttribute EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3794:2: iv_ruleDataTypeAttribute= ruleDataTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getDataTypeAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypeAttribute_in_entryRuleDataTypeAttribute8601);
            iv_ruleDataTypeAttribute=ruleDataTypeAttribute();

            state._fsp--;

             current =iv_ruleDataTypeAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataTypeAttribute8611); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeAttribute"


    // $ANTLR start "ruleDataTypeAttribute"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3801:1: ruleDataTypeAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3804:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3805:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3805:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3805:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3805:2: ( (otherlv_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3806:1: (otherlv_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3806:1: (otherlv_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3807:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataTypeAttribute8656); 

            		newLeafNode(otherlv_0, grammarAccess.getDataTypeAttributeAccess().getIsOfTypeDataTypeCrossReference_0_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3818:2: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3819:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3819:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3820:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataTypeAttribute8673); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypeAttribute"


    // $ANTLR start "entryRuleEInt"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3844:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3845:2: (iv_ruleEInt= ruleEInt EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3846:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt8715);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt8726); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3853:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3856:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3857:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3857:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3857:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3857:2: (kw= '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3858:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEInt8765); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt8782); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleCharacterization"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3878:1: entryRuleCharacterization returns [EObject current=null] : iv_ruleCharacterization= ruleCharacterization EOF ;
    public final EObject entryRuleCharacterization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterization = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3879:2: (iv_ruleCharacterization= ruleCharacterization EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3880:2: iv_ruleCharacterization= ruleCharacterization EOF
            {
             newCompositeNode(grammarAccess.getCharacterizationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_entryRuleCharacterization8827);
            iv_ruleCharacterization=ruleCharacterization();

            state._fsp--;

             current =iv_ruleCharacterization; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharacterization8837); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharacterization"


    // $ANTLR start "ruleCharacterization"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3887:1: ruleCharacterization returns [EObject current=null] : ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleEInt ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' ) ;
    public final EObject ruleCharacterization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_4_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3890:28: ( ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleEInt ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3891:1: ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleEInt ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3891:1: ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleEInt ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3891:2: () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleEInt ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3891:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3892:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCharacterizationAccess().getCharacterizationAction_0(),
                        current);
                

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3897:2: (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleEInt ) ) otherlv_5= ']' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==32) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3897:4: otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleEInt ) ) otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCharacterization8884); 

                        	newLeafNode(otherlv_1, grammarAccess.getCharacterizationAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3901:1: ( (lv_sourceLowerBound_2_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3902:1: (lv_sourceLowerBound_2_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3902:1: (lv_sourceLowerBound_2_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3903:3: lv_sourceLowerBound_2_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterizationAccess().getSourceLowerBoundEIntParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCharacterization8905);
                    lv_sourceLowerBound_2_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_2_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCharacterization8917); 

                        	newLeafNode(otherlv_3, grammarAccess.getCharacterizationAccess().getFullStopFullStopKeyword_1_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3923:1: ( (lv_sourceUpperBound_4_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3924:1: (lv_sourceUpperBound_4_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3924:1: (lv_sourceUpperBound_4_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3925:3: lv_sourceUpperBound_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterizationAccess().getSourceUpperBoundEIntParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCharacterization8938);
                    lv_sourceUpperBound_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleCharacterization8950); 

                        	newLeafNode(otherlv_5, grammarAccess.getCharacterizationAccess().getRightSquareBracketKeyword_1_4());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleCharacterization8964); 

                	newLeafNode(otherlv_6, grammarAccess.getCharacterizationAccess().getCharacterizedByKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3949:1: ( (otherlv_7= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3950:1: (otherlv_7= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3950:1: (otherlv_7= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3951:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCharacterizationRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCharacterization8984); 

            		newLeafNode(otherlv_7, grammarAccess.getCharacterizationAccess().getTargetIntrinsicMomentUniversalCrossReference_3_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3962:2: (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==32) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3962:4: otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']'
                    {
                    otherlv_8=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCharacterization8997); 

                        	newLeafNode(otherlv_8, grammarAccess.getCharacterizationAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3966:1: ( (lv_targetLowerBound_9_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3967:1: (lv_targetLowerBound_9_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3967:1: (lv_targetLowerBound_9_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3968:3: lv_targetLowerBound_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterizationAccess().getTargetLowerBoundEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCharacterization9018);
                    lv_targetLowerBound_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCharacterization9030); 

                        	newLeafNode(otherlv_10, grammarAccess.getCharacterizationAccess().getFullStopFullStopKeyword_4_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3988:1: ( (lv_targetUpperBound_11_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3989:1: (lv_targetUpperBound_11_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3989:1: (lv_targetUpperBound_11_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3990:3: lv_targetUpperBound_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterizationAccess().getTargetUpperBoundEIntParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCharacterization9051);
                    lv_targetUpperBound_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleCharacterization9063); 

                        	newLeafNode(otherlv_12, grammarAccess.getCharacterizationAccess().getRightSquareBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCharacterization9077); 

                	newLeafNode(otherlv_13, grammarAccess.getCharacterizationAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharacterization"


    // $ANTLR start "entryRuleMediation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4022:1: entryRuleMediation returns [EObject current=null] : iv_ruleMediation= ruleMediation EOF ;
    public final EObject entryRuleMediation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4023:2: (iv_ruleMediation= ruleMediation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4024:2: iv_ruleMediation= ruleMediation EOF
            {
             newCompositeNode(grammarAccess.getMediationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMediation_in_entryRuleMediation9113);
            iv_ruleMediation=ruleMediation();

            state._fsp--;

             current =iv_ruleMediation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMediation9123); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediation"


    // $ANTLR start "ruleMediation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4031:1: ruleMediation returns [EObject current=null] : ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleEInt ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' ) ;
    public final EObject ruleMediation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_3_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_5_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4034:28: ( ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleEInt ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4035:1: ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleEInt ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4035:1: ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleEInt ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4035:2: () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleEInt ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4035:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4036:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMediationAccess().getMediationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleMediation9169); 

                	newLeafNode(otherlv_1, grammarAccess.getMediationAccess().getMediatesKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4045:1: (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleEInt ) ) otherlv_6= ']' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==32) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4045:3: otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleEInt ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMediation9182); 

                        	newLeafNode(otherlv_2, grammarAccess.getMediationAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4049:1: ( (lv_sourceLowerBound_3_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4050:1: (lv_sourceLowerBound_3_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4050:1: (lv_sourceLowerBound_3_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4051:3: lv_sourceLowerBound_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediationAccess().getSourceLowerBoundEIntParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMediation9203);
                    lv_sourceLowerBound_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_3_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMediation9215); 

                        	newLeafNode(otherlv_4, grammarAccess.getMediationAccess().getFullStopFullStopKeyword_2_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4071:1: ( (lv_sourceUpperBound_5_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4072:1: (lv_sourceUpperBound_5_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4072:1: (lv_sourceUpperBound_5_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4073:3: lv_sourceUpperBound_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediationAccess().getSourceUpperBoundEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMediation9236);
                    lv_sourceUpperBound_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMediation9248); 

                        	newLeafNode(otherlv_6, grammarAccess.getMediationAccess().getRightSquareBracketKeyword_2_4());
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4093:3: ( (otherlv_7= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4094:1: (otherlv_7= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4094:1: (otherlv_7= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4095:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMediationRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMediation9270); 

            		newLeafNode(otherlv_7, grammarAccess.getMediationAccess().getTargetExternallyDependentUniversalCrossReference_3_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4106:2: (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==32) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4106:4: otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']'
                    {
                    otherlv_8=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMediation9283); 

                        	newLeafNode(otherlv_8, grammarAccess.getMediationAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4110:1: ( (lv_targetLowerBound_9_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4111:1: (lv_targetLowerBound_9_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4111:1: (lv_targetLowerBound_9_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4112:3: lv_targetLowerBound_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediationAccess().getTargetLowerBoundEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMediation9304);
                    lv_targetLowerBound_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMediation9316); 

                        	newLeafNode(otherlv_10, grammarAccess.getMediationAccess().getFullStopFullStopKeyword_4_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4132:1: ( (lv_targetUpperBound_11_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4133:1: (lv_targetUpperBound_11_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4133:1: (lv_targetUpperBound_11_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4134:3: lv_targetUpperBound_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediationAccess().getTargetUpperBoundEIntParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMediation9337);
                    lv_targetUpperBound_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMediation9349); 

                        	newLeafNode(otherlv_12, grammarAccess.getMediationAccess().getRightSquareBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMediation9363); 

                	newLeafNode(otherlv_13, grammarAccess.getMediationAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediation"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA2_eotS =
        "\31\uffff";
    static final String DFA2_eofS =
        "\31\uffff";
    static final String DFA2_minS =
        "\1\4\20\uffff\2\63\6\uffff";
    static final String DFA2_maxS =
        "\1\67\20\uffff\2\72\6\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\2\uffff\1\23\1\24\1\25\1\21\1\22\1\26";
    static final String DFA2_specialS =
        "\31\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\6\uffff\1\1\2\uffff\2\2\6\uffff\1\3\2\uffff\1\4\1\5\4\6"+
            "\10\uffff\1\7\1\10\2\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1"+
            "\21\2\uffff\1\22\1\23\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\6\uffff\1\25",
            "\1\27\6\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "125:1: (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation )";
        }
    }
    static final String DFA13_eotS =
        "\36\uffff";
    static final String DFA13_eofS =
        "\36\uffff";
    static final String DFA13_minS =
        "\5\33\2\4\3\33\2\40\1\6\4\uffff\2\6\1\41\1\6\1\41\3\6\1\42\1\6\1"+
        "\42\2\43";
    static final String DFA13_maxS =
        "\1\36\4\37\2\4\3\37\1\46\1\45\1\74\4\uffff\1\74\1\6\1\41\1\6\1\41"+
        "\2\74\1\6\1\42\1\6\1\42\1\46\1\45";
    static final String DFA13_acceptS =
        "\15\uffff\1\3\1\4\1\1\1\2\15\uffff";
    static final String DFA13_specialS =
        "\36\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\2\1\3\1\4",
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\7\1\10\1\3\1\11\1\6",
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\12",
            "\1\13",
            "\1\7\1\10\1\3\1\11\1\6",
            "\1\7\1\10\1\3\1\11\1\6",
            "\1\7\1\10\1\3\1\11\1\6",
            "\1\14\2\uffff\1\17\1\20\1\15\1\16",
            "\1\21\2\uffff\1\17\1\20\1\15",
            "\1\23\65\uffff\1\22",
            "",
            "",
            "",
            "",
            "\1\25\65\uffff\1\24",
            "\1\23",
            "\1\26",
            "\1\25",
            "\1\27",
            "\1\31\65\uffff\1\30",
            "\1\33\65\uffff\1\32",
            "\1\31",
            "\1\34",
            "\1\33",
            "\1\35",
            "\1\17\1\20\1\15\1\16",
            "\1\17\1\20\1\15"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "947:1: (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_ruleModel140 = new BitSet(new long[]{0x00E7FF807E40C812L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_ruleElement234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneralizationSet_in_ruleElement261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveDataType_in_ruleElement288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComplexDataType_in_ruleElement315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_ruleElement342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeronymicRelation_in_ruleElement369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKind_in_ruleElement396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantityUniversal_in_ruleElement423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectiveUniversal_in_ruleElement450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubKind_in_ruleElement477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_ruleElement504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhase_in_ruleElement531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_ruleElement558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixin_in_ruleElement585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoleMixin_in_ruleElement612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelatorUniversal_in_ruleElement639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryMaterialRelation_in_ruleElement666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryFormalRelation_in_ruleElement693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModeUniversal_in_ruleElement720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualityUniversal_in_ruleElement747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulenAryMaterialRelation_in_ruleElement774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulenAryFormalRelation_in_ruleElement801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_entryRulePackage844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulePackage900 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePackage917 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage934 = new BitSet(new long[]{0x00E7FF807E40E810L});
        public static final BitSet FOLLOW_ruleElement_in_rulePackage955 = new BitSet(new long[]{0x00E7FF807E40E810L});
        public static final BitSet FOLLOW_13_in_rulePackage968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneralizationSet_in_entryRuleGeneralizationSet1004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGeneralizationSet1014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompleteGeneralizationSet_in_ruleGeneralizationSet1061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnonymousGeneralizationSet_in_ruleGeneralizationSet1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompleteGeneralizationSet_in_entryRuleCompleteGeneralizationSet1123 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompleteGeneralizationSet1133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleCompleteGeneralizationSet1176 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCompleteGeneralizationSet1202 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1219 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCompleteGeneralizationSet1236 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1256 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleCompleteGeneralizationSet1268 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1288 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleCompleteGeneralizationSet1301 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1321 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleCompleteGeneralizationSet1335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnonymousGeneralizationSet_in_entryRuleAnonymousGeneralizationSet1371 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnonymousGeneralizationSet1381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnonymousGeneralizationSet1426 = new BitSet(new long[]{0x0000000000250000L});
        public static final BitSet FOLLOW_18_in_ruleAnonymousGeneralizationSet1441 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnonymousGeneralizationSet1461 = new BitSet(new long[]{0x0000000000340000L});
        public static final BitSet FOLLOW_20_in_ruleAnonymousGeneralizationSet1476 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_21_in_ruleAnonymousGeneralizationSet1494 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_16_in_ruleAnonymousGeneralizationSet1515 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_21_in_ruleAnonymousGeneralizationSet1533 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnonymousGeneralizationSet1555 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAnonymousGeneralizationSet1567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveDataType_in_entryRulePrimitiveDataType1607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDataType1617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rulePrimitiveDataType1654 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveDataType1671 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_rulePrimitiveDataType1688 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rulePrimitiveDataTypeType_in_rulePrimitiveDataType1709 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulePrimitiveDataType1721 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePrimitiveDataType1733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComplexDataType_in_entryRuleComplexDataType1769 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComplexDataType1779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleComplexDataType1816 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComplexDataType1833 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComplexDataType1850 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleDataTypeAttribute_in_ruleComplexDataType1871 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_19_in_ruleComplexDataType1884 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleDataTypeAttribute_in_ruleComplexDataType1905 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_13_in_ruleComplexDataType1919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1955 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEnumeration2002 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration2019 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEnumeration2036 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumeration2057 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleEnumeration2070 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumeration2091 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleEnumeration2105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeronymicRelation_in_entryRuleMeronymicRelation2141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMeronymicRelation2151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentOfRelation_in_ruleMeronymicRelation2198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMembershipRelation_in_ruleMeronymicRelation2225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubCollectionRelation_in_ruleMeronymicRelation2252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubQuantityRelation_in_ruleMeronymicRelation2279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentOfRelation_in_entryRuleComponentOfRelation2314 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentOfRelation2324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleComponentOfRelation2412 = new BitSet(new long[]{0x00000000F8000000L});
        public static final BitSet FOLLOW_28_in_ruleComponentOfRelation2497 = new BitSet(new long[]{0x00000000F8000000L});
        public static final BitSet FOLLOW_29_in_ruleComponentOfRelation2582 = new BitSet(new long[]{0x00000000F8000000L});
        public static final BitSet FOLLOW_30_in_ruleComponentOfRelation2667 = new BitSet(new long[]{0x00000000F8000000L});
        public static final BitSet FOLLOW_31_in_ruleComponentOfRelation2738 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComponentOfRelation2758 = new BitSet(new long[]{0x0000000900000000L});
        public static final BitSet FOLLOW_32_in_ruleComponentOfRelation2771 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleComponentOfRelation2792 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleComponentOfRelation2804 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleComponentOfRelation2825 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleComponentOfRelation2837 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleComponentOfRelation2851 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComponentOfRelation2871 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleComponentOfRelation2884 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleComponentOfRelation2905 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleComponentOfRelation2917 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleComponentOfRelation2938 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleComponentOfRelation2950 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleComponentOfRelation2964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMembershipRelation_in_entryRuleMembershipRelation3000 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMembershipRelation3010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleMembershipRelation3098 = new BitSet(new long[]{0x00000000F8000000L});
        public static final BitSet FOLLOW_28_in_ruleMembershipRelation3183 = new BitSet(new long[]{0x00000000F8000000L});
        public static final BitSet FOLLOW_29_in_ruleMembershipRelation3268 = new BitSet(new long[]{0x00000000F8000000L});
        public static final BitSet FOLLOW_30_in_ruleMembershipRelation3353 = new BitSet(new long[]{0x00000000F8000000L});
        public static final BitSet FOLLOW_31_in_ruleMembershipRelation3424 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMembershipRelation3444 = new BitSet(new long[]{0x0000001100000000L});
        public static final BitSet FOLLOW_32_in_ruleMembershipRelation3457 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMembershipRelation3478 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMembershipRelation3490 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMembershipRelation3511 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleMembershipRelation3523 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleMembershipRelation3537 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMembershipRelation3557 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleMembershipRelation3570 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMembershipRelation3591 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMembershipRelation3603 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMembershipRelation3624 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleMembershipRelation3636 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMembershipRelation3650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubCollectionRelation_in_entryRuleSubCollectionRelation3686 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubCollectionRelation3696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleSubCollectionRelation3784 = new BitSet(new long[]{0x00000000F8000000L});
        public static final BitSet FOLLOW_28_in_ruleSubCollectionRelation3869 = new BitSet(new long[]{0x00000000F8000000L});
        public static final BitSet FOLLOW_29_in_ruleSubCollectionRelation3954 = new BitSet(new long[]{0x00000000F8000000L});
        public static final BitSet FOLLOW_30_in_ruleSubCollectionRelation4039 = new BitSet(new long[]{0x00000000F8000000L});
        public static final BitSet FOLLOW_31_in_ruleSubCollectionRelation4110 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubCollectionRelation4130 = new BitSet(new long[]{0x0000002100000000L});
        public static final BitSet FOLLOW_32_in_ruleSubCollectionRelation4143 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubCollectionRelation4164 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleSubCollectionRelation4176 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubCollectionRelation4197 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleSubCollectionRelation4209 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleSubCollectionRelation4223 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubCollectionRelation4243 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleSubCollectionRelation4256 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubCollectionRelation4277 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleSubCollectionRelation4289 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubCollectionRelation4310 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleSubCollectionRelation4322 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSubCollectionRelation4336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubQuantityRelation_in_entryRuleSubQuantityRelation4372 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubQuantityRelation4382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleSubQuantityRelation4470 = new BitSet(new long[]{0x00000000D8000000L});
        public static final BitSet FOLLOW_28_in_ruleSubQuantityRelation4555 = new BitSet(new long[]{0x00000000D8000000L});
        public static final BitSet FOLLOW_30_in_ruleSubQuantityRelation4640 = new BitSet(new long[]{0x00000000D8000000L});
        public static final BitSet FOLLOW_31_in_ruleSubQuantityRelation4711 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubQuantityRelation4731 = new BitSet(new long[]{0x0000004100000000L});
        public static final BitSet FOLLOW_32_in_ruleSubQuantityRelation4744 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubQuantityRelation4765 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleSubQuantityRelation4777 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubQuantityRelation4798 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleSubQuantityRelation4810 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleSubQuantityRelation4824 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubQuantityRelation4844 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleSubQuantityRelation4857 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubQuantityRelation4878 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleSubQuantityRelation4890 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubQuantityRelation4911 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleSubQuantityRelation4923 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSubQuantityRelation4937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKind_in_entryRuleKind4973 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKind4983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleKind5029 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKind5046 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleKind5063 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleKind5084 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_13_in_ruleKind5097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantityUniversal_in_entryRuleQuantityUniversal5133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuantityUniversal5143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleQuantityUniversal5189 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQuantityUniversal5206 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleQuantityUniversal5223 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleQuantityUniversal5244 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_13_in_ruleQuantityUniversal5257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectiveUniversal_in_entryRuleCollectiveUniversal5293 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectiveUniversal5303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleCollectiveUniversal5346 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleCollectiveUniversal5372 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCollectiveUniversal5389 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCollectiveUniversal5406 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleCollectiveUniversal5427 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_13_in_ruleCollectiveUniversal5440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubKind_in_entryRuleSubKind5476 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubKind5486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleSubKind5532 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubKind5549 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSubKind5566 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleSubKind5587 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_13_in_ruleSubKind5600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole5636 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole5646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleRole5683 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRole5700 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRole5717 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleRole5738 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_13_in_ruleRole5751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhase_in_entryRulePhase5787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePhase5797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rulePhase5843 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePhase5860 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePhase5877 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_rulePhase5898 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_13_in_rulePhase5911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory5947 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCategory5957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleCategory6003 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCategory6020 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCategory6037 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCategory6049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin6085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMixin6095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleMixin6141 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMixin6158 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMixin6175 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMixin6187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoleMixin_in_entryRuleRoleMixin6223 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoleMixin6233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleRoleMixin6270 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRoleMixin6287 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRoleMixin6304 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRoleMixin6316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelatorUniversal_in_entryRuleRelatorUniversal6352 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelatorUniversal6362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleRelatorUniversal6399 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRelatorUniversal6416 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRelatorUniversal6433 = new BitSet(new long[]{0x6000000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleRelatorUniversal6454 = new BitSet(new long[]{0x6000000100002000L});
        public static final BitSet FOLLOW_ruleMediation_in_ruleRelatorUniversal6476 = new BitSet(new long[]{0x4000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRelatorUniversal6489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryMaterialRelation_in_entryRuleBinaryMaterialRelation6525 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryMaterialRelation6535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleBinaryMaterialRelation6572 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleBinaryMaterialRelation6584 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6604 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_32_in_ruleBinaryMaterialRelation6617 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6638 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleBinaryMaterialRelation6650 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6671 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleBinaryMaterialRelation6683 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6702 = new BitSet(new long[]{0x0010000000800000L});
        public static final BitSet FOLLOW_23_in_ruleBinaryMaterialRelation6720 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6740 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleBinaryMaterialRelation6752 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleBinaryMaterialRelation6766 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6786 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleBinaryMaterialRelation6799 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6820 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleBinaryMaterialRelation6832 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6853 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleBinaryMaterialRelation6865 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBinaryMaterialRelation6879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryFormalRelation_in_entryRuleBinaryFormalRelation6915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryFormalRelation6925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleBinaryFormalRelation6962 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleBinaryFormalRelation6974 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryFormalRelation6994 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_32_in_ruleBinaryFormalRelation7007 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryFormalRelation7028 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleBinaryFormalRelation7040 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryFormalRelation7061 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleBinaryFormalRelation7073 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryFormalRelation7092 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryFormalRelation7117 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleBinaryFormalRelation7130 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryFormalRelation7151 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleBinaryFormalRelation7163 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryFormalRelation7184 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleBinaryFormalRelation7196 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBinaryFormalRelation7210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModeUniversal_in_entryRuleModeUniversal7246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModeUniversal7256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleModeUniversal7293 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModeUniversal7310 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModeUniversal7327 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleModeUniversal7348 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_13_in_ruleModeUniversal7361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualityUniversal_in_entryRuleQualityUniversal7397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualityUniversal7407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleQualityUniversal7444 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualityUniversal7461 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleQualityUniversal7478 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualityUniversal7498 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleQualityUniversal7510 = new BitSet(new long[]{0x2200000100002000L});
        public static final BitSet FOLLOW_57_in_ruleQualityUniversal7523 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleQualityUniversal7535 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualityUniversal7555 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_18_in_ruleQualityUniversal7568 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualityUniversal7588 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_24_in_ruleQualityUniversal7602 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleQualityUniversal7625 = new BitSet(new long[]{0x2000000100002000L});
        public static final BitSet FOLLOW_13_in_ruleQualityUniversal7638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulenAryMaterialRelation_in_entryRulenAryMaterialRelation7674 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulenAryMaterialRelation7684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rulenAryMaterialRelation7721 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_rulenAryMaterialRelation7733 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryMaterialRelation7753 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryMaterialRelation7770 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryMaterialRelation7796 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulenAryMaterialRelation7809 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryMaterialRelation7830 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulenAryMaterialRelation7842 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryMaterialRelation7863 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_rulenAryMaterialRelation7875 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_18_in_rulenAryMaterialRelation7889 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryMaterialRelation7909 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_32_in_rulenAryMaterialRelation7924 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryMaterialRelation7945 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulenAryMaterialRelation7957 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryMaterialRelation7978 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_rulenAryMaterialRelation7990 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulenAryMaterialRelation8005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulenAryFormalRelation_in_entryRulenAryFormalRelation8041 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulenAryFormalRelation8051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rulenAryFormalRelation8088 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_rulenAryFormalRelation8100 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryFormalRelation8117 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryFormalRelation8143 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulenAryFormalRelation8156 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryFormalRelation8177 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulenAryFormalRelation8189 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryFormalRelation8210 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_rulenAryFormalRelation8222 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_18_in_rulenAryFormalRelation8236 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryFormalRelation8256 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_32_in_rulenAryFormalRelation8271 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryFormalRelation8292 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulenAryFormalRelation8304 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryFormalRelation8325 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_rulenAryFormalRelation8337 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulenAryFormalRelation8352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString8389 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString8400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString8440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString8466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveDataTypeType_in_entryRulePrimitiveDataTypeType8514 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDataTypeType8525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rulePrimitiveDataTypeType8562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataTypeAttribute_in_entryRuleDataTypeAttribute8601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeAttribute8611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeAttribute8656 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeAttribute8673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt8715 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt8726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleEInt8765 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt8782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterization_in_entryRuleCharacterization8827 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharacterization8837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleCharacterization8884 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCharacterization8905 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleCharacterization8917 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCharacterization8938 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleCharacterization8950 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_61_in_ruleCharacterization8964 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCharacterization8984 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleCharacterization8997 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCharacterization9018 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleCharacterization9030 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCharacterization9051 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleCharacterization9063 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleCharacterization9077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMediation_in_entryRuleMediation9113 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMediation9123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleMediation9169 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_32_in_ruleMediation9182 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMediation9203 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMediation9215 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMediation9236 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleMediation9248 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMediation9270 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleMediation9283 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMediation9304 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMediation9316 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMediation9337 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleMediation9349 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMediation9363 = new BitSet(new long[]{0x0000000000000002L});
    }


}